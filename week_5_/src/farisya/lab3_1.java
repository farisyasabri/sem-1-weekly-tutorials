package farisya;

import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter 2 integer numbers");
        System.out.print("number 1: ");
        int num1 = x.nextInt();
        System.out.print("number 2: ");
        int num2 = x.nextInt();
        System.out.print("Enter operand: ");
        char operand = x.next().charAt(0);

        switch(operand){
            case '+' :
                int ans = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is: " + ans );
                break;

            case '-' :
                ans = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " is: " + ans );
                break;

            case '*' :
                ans = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is: " + ans);
                break;

            case '/' :
                ans = num1 / num2;
                System.out.println("The quotation of division " + num1 + " and " + num2 + " is: " + ans);
                break;

            case '%' :
                ans = num1 % num2;
                System.out.println("The remainder of division " + num1 + " and " + num2 + " is: " + ans);
                break;

            default:
                System.out.println("invalid operand");
        }

    }
}
