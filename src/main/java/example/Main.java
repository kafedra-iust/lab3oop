package example;

import example.birds.*;
import example.explorer.Explorer;

public class Main {

    public static void main(String[] args) {

        Bird[] birds = {
                new Sparrow("Джек"),
                new Penguin("Пінго"),
                new CamelBird("Степан")
        };

        Explorer explorer = new Explorer();

        System.out.println("=== Перегляд птахів дослідником ===");
        for (Bird bird : birds) {
            explorer.treatBird(bird);
        }

        System.out.println("=== Перевірка поведінки птахів ===");
        for (Bird bird : birds) {
            System.out.println(bird.getName() + " " + bird.move());
            System.out.print("Харчування: ");
            for (String food : bird.eat()) {
                System.out.print(food + " ");
            }
            System.out.println("\n");
        }
    }
}