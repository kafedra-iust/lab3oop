package example.birds;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "ходить та плаває";
    }

    @Override
    public String[] eat() {
        return new String[]{"риба", "креветки"};
    }

    @Override
    public String getDescription() {
        return "Пінгвін — нелітний птах, чудово плаває.";
    }
}