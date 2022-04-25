package farisya;

import java.util.Random;
import java.util.Scanner;

public class lab6_5 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int ans, score=0;
        do {
            System.out.println("Enter negative number to quit: ");
            int num1 = r.nextInt(13);
            int num2 = r.nextInt(13);
            System.out.print(num1 + " x " + num2 + " = ");
            ans = s.nextInt();
            score = score + game(num1,num2,ans);
        }
        while(ans>=0);
        System.out.println("your score is : " + score);

    }
    public static int game(int a, int b, int ans){
        int count;
        if(a*b==ans)
            count=1;
        else
            count=0;
        return count;
    }
}
