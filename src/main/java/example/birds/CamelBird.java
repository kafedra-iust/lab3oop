package example.birds;

public class CamelBird extends Bird {

    public CamelBird(String name) {
        super(name);
    }

    @Override
    public String move() {
        return "бігає";
    }

    @Override
    public String[] eat() {
        return new String[]{"листя", "трава", "зерно"};
    }

    @Override
    public String getDescription() {
        return "Страус (CamelBird) — найбільший птах, що швидко бігає.";
    }
}
