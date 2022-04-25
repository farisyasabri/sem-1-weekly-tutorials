package farisya;

import java.util.Scanner;

public class tutorial3_4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("- Please enter 3 numbers -");
        System.out.print("first number: ");
        int num1 = n.nextInt();
        System.out.print("second number: ");
        int num2 = n.nextInt();
        System.out.print("third number: ");
        int num3 = n.nextInt();

        if(num1>num2 && num1 >num3)
            System.out.println("The biggest number is " + num1);
        else if(num2>num1 && num2>num3)
            System.out.println("The biggest number is " + num2);
        else
            System.out.println("The biggest number is " + num3);
    }
}
