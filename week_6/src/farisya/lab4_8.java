package farisya;

import java.util.Random;

public class lab4_8 {
    public static void main(String[] args) {

        Random n = new Random();
        int MAX = 100;
        int num = n.nextInt(MAX) +1;
        int factor=2;

        System.out.println("generated number : " + num);
        for(int i=1; i<=num;i++)
        {
            if(num%factor!=0)
            {
                System.out.println(num);
            }
            num++;
        }

    }
}
