package farisya;

import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the sales volume : ");
        int sales = x.nextInt();
        double commission;

        if(sales<=100)
            commission = 0.05 * sales;
        else if(sales>100 && sales<=500)
            commission = 0.075 * sales;
        else if(sales>500 && sales<=1000)
            commission = 0.1 * sales;
        else
            commission = 0.125 * sales;

        System.out.printf("The total of commision is : RM %.2f", commission);
    }
}
