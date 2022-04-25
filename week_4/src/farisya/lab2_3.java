package farisya;

import java.util.Random;

public class lab2_3 {
    public static void main(String[] args) {
        int MAX = 50;
        int MIN = 10;
        Random n = new Random();
        int i = 1;
        int sum = 0;
        while (i<=3)
        {   int num = n.nextInt(MAX-MIN +1) + MIN;
            System.out.println(num);
            sum+=num;
            i++;
        }
        double average = sum/3.00;
        System.out.println("sum of three random numbers is = " + sum );
        System.out.printf("average = %.2f", average);
    }
}
