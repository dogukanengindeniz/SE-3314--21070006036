package week6EldoriaGame;

public class Enemy extends Character{

    public Enemy(String name, int level) {
        super(name, level);
    }

    @Override
    public void speak() {
        System.out.println("You are not going to pass here!");
    }


}
