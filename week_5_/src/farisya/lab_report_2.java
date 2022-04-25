package farisya;

import java.util.Random;
import java.util.Scanner;

public class lab_report_2 {
    public static void main(String[] args) {
        Random x = new Random();
        final int MAX = 6;
        int score1 = 0 , score2 = 0;
        int life=1 ;
        int play1_1= 0, play1_2=0;

          while(life != 3) {
              //play1_1 = x.nextInt(MAX) + 1;
              //play1_2 = x.nextInt(MAX) + 1;
              Scanner k = new Scanner(System.in);
              System.out.println("roll dice twice:");
              play1_1 = k.nextInt();
              play1_2 = k.nextInt();
              System.out.println("dice 1 player 1 : " + play1_1);
              System.out.println("dice 2 player 1 : " + play1_2 );
              if (play1_1 == 1 && play1_2 == 1) {
                  score1 = score1 * 2;
              } else if ((play1_1 % 2 != 0 && play1_2 % 2 != 0) && (play1_1 != 1 && play1_2 != 1)) {
                  score1 = score1 - 5;
              } else if (play1_1 == 6 && play1_2 == 6) {
                  System.out.println("you can roll your dice again:");
                  life = life - 2;
              } else
                  score1 += play1_1 + play1_2;

              // System.out.println(play1_1);
              // System.out.println(play1_2);
              System.out.println(score1);
              life++;
          }

    }
}
