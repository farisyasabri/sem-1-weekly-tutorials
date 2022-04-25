package sem1;

import java.util.Random;

public class Game {
    private String name;
    public int score=0;
    private Random r = new Random();

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(){
        int dice = r.nextInt(6)+1;
        score += dice;
    }
}
