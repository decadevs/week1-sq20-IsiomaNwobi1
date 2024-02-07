package task1;

abstract public class Staff {
    private String name;

    public Staff(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}