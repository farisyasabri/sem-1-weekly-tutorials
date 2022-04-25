package farisya;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class lab4_7 {
    public static void main(String[] args) {
        double monthly_pay, principal, int_rate,C ,L , R;// numerator, dominator;
        int month;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        principal = input.nextDouble();
        System.out.print("Enter interest rate is % : ");
        int_rate = input.nextDouble();
        System.out.print("Enter total number of month(s) : ");
        month = input.nextInt();

        /*numerator = principal*(int_rate/(12*100));
        dominator = (1-Math.pow((1+int_rate/(12*100)),-month));
        monthly_pay = numerator/dominator;*/

        monthly_pay = (principal * (int_rate/(12*100)) )/ (1 - Math.pow((1 + int_rate/ (12*100) ), -month ) );
        //monthly_pay = (principal*(int_rate/(12*100)))/ (1-Math.pow((1+int_rate/(12*100)),-month));


        //row 1
        for (int i=1; i<8 ; i++)
            switch (i) {
                case 1 : System.out.print("Month    "); break;
                case 2 : System.out.print("Monthly Payment      "); break;
                case 3 : System.out.print("Principal    "); break;
                case 4 : System.out.print("Interest     "); break;
                case 5 : System.out.print("Unpaid Balance       ");break;
                case 6 : System.out.print("Total Interest   ");break;
                case 7 : System.out.println();
            }

        //int count=1;
        //n=month;
        //while(count <= month)
        double total_interest = 0;
        for(int count=1; count<= month ; count++)
        {
            C = monthly_pay * Math.pow(( 1+ int_rate/(12*100)),-(1+month-count));
            L = monthly_pay - C;
            R = (L/(int_rate/(12*100)))-C;
            total_interest += L;

            System.out.printf("%-10d %10.2f %15.2f %15.2f %15.2f %15.2f  \n", count, monthly_pay, C,L,R, total_interest);
            //System.out.printf("%10.2f", monthly_pay);
            //System.out.printf("%10.2f", C);
            //System.out.printf("%10.2f", L);
            //System.out.printf("%10.2f",R);
            //System.out.println();
            //count++;
        }

    }
}