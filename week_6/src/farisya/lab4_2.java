package farisya;

import java.util.Scanner;

public class lab4_2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = n.nextInt();
        int sum = 0;
        int sum2 =0;
        for(int i=1; i<=num ; i++)
        {
            sum+=i;
            sum2+=sum;
        }
        System.out.println("Total = " + sum2);

    }
}
