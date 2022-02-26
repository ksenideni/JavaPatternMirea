package ru.mirea.task3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.concurrent.Semaphore;

@Component
@Aspect
public class AspectClass {
    @Around("execution (* java.util.List.*(..))")
    public Object aroundListMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        synchronized (this) {
            return proceedingJoinPoint.proceed();
        }
    }
    private Semaphore semaphore = new Semaphore(1);
    @Around("execution (* java.util.Set.*(..))")
    public Object aroundSetMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        semaphore.acquire();

        Object returnType = proceedingJoinPoint.proceed();

        semaphore.release();
        return returnType;
    }
}