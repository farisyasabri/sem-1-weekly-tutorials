package farisya;

import java.util.Scanner;

public class revision_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double deposit, rate;
        int month;
        System.out.print("Enter deposit amount (RM) : ");
        deposit = s.nextDouble();
        System.out.print("Enter number of months : ");
        month = s.nextInt();
        System.out.print("Enter annual interest rate (%): ");
        rate = s.nextDouble();

        System.out.printf("%-10s%-15s%-15s%-20s\n","Month", "Principal (P)",
                "Interest (r)",  "Interest r/1200*p");
        double interest, p=deposit, total=0;
        for(int i=1; i<=month; i++, rate+=0.12) {
            interest = p * rate / 1200;
            total+=interest;
            System.out.printf("%-10d%-15.2f%-15.2f%-20.2f\n", i, p, rate, interest);
            p +=interest;
        }
        System.out.printf("Total Interest RM : %.2f\n", total);

    }
}
