package example.birds;

public abstract class Bird {
    protected String name;

    public Bird(String name) {
        this.name = name;
    }

    public abstract String move();
    public abstract String[] eat();
    public abstract String getDescription();

    public String getName() {
        return name;
    }
}