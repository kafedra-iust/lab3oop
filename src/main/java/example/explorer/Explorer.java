package example.explorer;

import example.birds.Bird;

public class Explorer {

    public void treatBird(Bird bird) {
        System.out.println("Дослідник бачить птаха: " + bird.getName());
        System.out.println("Опис: " + bird.getDescription());
        System.out.println();
    }
}