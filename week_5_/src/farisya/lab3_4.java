package farisya;

import java.util.Random;

public class lab3_4 {
    public static void main(String[] args) {
        final int MAX = 6;
        Random d = new Random();
        int score1 = 0, score2 = 0;

        System.out.println("\n    INTERNATIONAL DICE ROLL GAME");
        System.out.println("\n          -SCOREBOARD-            \n");
        System.out.printf("%s", "PLAYER 1");
        System.out.printf("%20s \n", "PLAYER 2");

        for (int i = 1; i <= 2; i++) {
            int player_1 = d.nextInt(MAX) + 1;
            int player_2 = d.nextInt(MAX) + 1;
            score1 += player_1;
            System.out.printf("%3s%d", " ", player_1);
            score2 += player_2;
            System.out.printf("%17s %d \n" , " ", player_2);
        }

        System.out.println("------------------------------");
        System.out.printf("%3s%d", " ", score1);
        System.out.printf("%17s %d \n" , " ", score2);

        if (score1 < score2)
            System.out.println("\n   PLAYER 2 WIN BRUHHH!!!");
        else if (score2 < score1)
            System.out.println("\n   PLAYER 1 WIN BRUHHH!!!");
        else
            System.out.println("\n     OH NOOO GAME TIE!!");


    }
}
