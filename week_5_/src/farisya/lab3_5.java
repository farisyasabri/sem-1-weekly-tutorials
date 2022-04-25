package farisya;

import java.util.Scanner;

public class lab3_5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");
        System.out.println("Enter a, b, c, d, e, f");

        System.out.print("a: ");
        int a = n.nextInt();

        System.out.print("b: ");
        int b = n.nextInt();

        System.out.print("c: ");
        int c = n.nextInt();

        System.out.print("d: ");
        int d = n.nextInt();

        System.out.print("e: ");
        int e = n.nextInt();

        System.out.print("f: ");
        int f = n.nextInt();

        double denominator = a*d - b*c;
        if (denominator!=0) {
            double x = (e * d - b * f) /  denominator;
            double y = (a * f - e * c) / denominator;
            System.out.printf("x = %.2f", x);
            System.out.printf("%5s y = %.2f"," ",y);
        }
        else
            System.out.println("The equation has no solution");
    }
}
