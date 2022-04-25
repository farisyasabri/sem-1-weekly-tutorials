package farisya;

import java.util.Scanner;

public class tutorial3_5 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = y.nextInt();
        //int leap = year%4;

        if(year%400==0)
            System.out.println(year + " is leap year");
        else if(year%4==0 && year%100!=0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
