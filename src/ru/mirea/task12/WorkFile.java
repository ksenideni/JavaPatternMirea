package ru.mirea.task12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component("file")
//Scope("singleton")
public class WorkFile {
    @Value("${path.input}")
    String fileName;
    @Value("${path.output}")
    String hashFileName;

    WorkFile() {
        System.out.println("constuctor");
    }

    //these annotations need javax.annotation:javax.annotation-api:1.3.2
    @PostConstruct
    void init() throws NoSuchAlgorithmException, IOException {
        System.out.println("start init");
        File f = new File(fileName);
        if(!f.isFile()){
            Files.write(Paths.get(hashFileName), "null".getBytes(StandardCharsets.UTF_8));
            return;
        }

        //-----Create file checksum with SHA
        // https://mkyong.com/java/how-to-generate-a-file-checksum-value-in-java/

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String hex;
        try (
                DigestInputStream dis = new DigestInputStream(new FileInputStream(fileName), md)) {
            while (dis.read() != -1) ; //empty loop to clear the data
            md = dis.getMessageDigest();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // bytes to hex
        StringBuilder result = new StringBuilder();
        for (byte b : md.digest()) {
            result.append(String.format("%02x", b));
        }
        System.out.println(result);
        Path path = Paths.get(hashFileName);
        Files.write(path, result.toString().getBytes(StandardCharsets.UTF_8));
        System.out.println("finish init");

    }

    @PreDestroy
    public void destroy() {
        System.out.println("start destroy");
        new File(hashFileName).delete();
        System.out.println("finish destroy");
    }
}
