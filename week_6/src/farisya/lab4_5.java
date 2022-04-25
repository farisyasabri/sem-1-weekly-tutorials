package farisya;

import java.util.Random;

public class lab4_5 {
    public static void main(String[] args) {
        Random d = new Random();
        int MAX =6;
        int score1=0;
        int score2=0;
        int player1, player2;

        do
        {
            player1 = d.nextInt(MAX)+1;
            if(player1==6)
                player1 = d.nextInt(MAX)+1;
            System.out.print(player1+ "    ");
            score1= score1 + player1;

            player2 = d.nextInt(MAX)+1;
            if(player2==6)
                player2 = d.nextInt(MAX)+1;
            System.out.println(player2);
            score2=score2 + player2;

        }
        while(score1<100 && score2<100);

        System.out.println("total score player 1 : " + score1);
        System.out.println("total score player 2 : " + score2);

        if (score1>score2)
            System.out.println("player 1 win");
        else if(score2>score1)
            System.out.println("player 2 win");
        else
            System.out.println("game tie");
    }
}
