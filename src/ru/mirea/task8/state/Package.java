package ru.mirea.task8.state;

public class Package { //context delegate the behavior to the state implementation
    private PackageState state = new OrderedState();

    // getter, setter
    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
