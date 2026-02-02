package example.birds;

public class Sparrow extends Bird {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "летить";
    }

    @Override
    public String[] eat() {
        return new String[]{"зерно", "комахи"};
    }

    @Override
    public String getDescription() {
        return "Горобець — маленький птах, що добре літає.";
    }
}