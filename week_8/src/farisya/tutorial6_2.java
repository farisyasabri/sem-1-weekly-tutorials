package farisya;

import java.util.Scanner;

public class tutorial6_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        decreasing(num1,num2,num3);
    }
    public static void decreasing(int a, int b, int c){

        int max;
        if (a>b && a>c)
            max = a;
        else if (b>a && b>c)
            max = b;
        else
            max = c;

        for (int i=0; i<=max;i++){
            if (i==a||i==b||i==c)
                System.out.print(i + " ");
        }
    }
}
