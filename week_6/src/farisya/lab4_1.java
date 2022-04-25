package farisya;

import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num = n.nextInt();
        System.out.println("Factors for " + num + " is: ");
        for(int i = 1; i<=num; i++)
        {
            int factor = num%i;
            if(factor==0)
                System.out.print(i + " ");
        }
    }
}
