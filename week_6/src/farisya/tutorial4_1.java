package farisya;

import java.util.Random;
import java.util.Scanner;

public class tutorial4_1 {
    public static void main(String[] args) {

        //question 1 a
        int num, j=1, t;    //=j-1;
        do{
            num = j*j*j;
            j++;
        }
        while(num<2000);

        //t=j-1;
        System.out.println("the largest n is: " + j + " = " + num );

        System.out.println();

        //question 1 b
        for(j=1;j<=12;j++)
        {	num = j*j;
            System.out.println(num);
        }

        System.out.println();

        //question 1 c
        //final int MAX = 101;
        Random n = new Random();
        for(j=0;j<=3;j++)
        {
            //int row = n.nextInt(101);
            //System.out.print( row );
            for(int k=0;k<=4;k++)
            {
                int col = n.nextInt(101);
                System.out.print( col + " " );
            }
            System.out.println();
        }

        System.out.println();

        //question 1 d
        Scanner m = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        num = m.nextInt();
        System.out.print("The sum of the numbers from 1 to " + num + " is : ");
        int sum = 0;
        for(int p=0; p<=num ; p++)
        {
            sum+=p;
        }
        System.out.println(sum);

        System.out.println();

        //question 1 e
        //int numerator =1;
        //int dominator = 25;
        double sum2 =0;
        for (int numerator=1,dominator=25; dominator!=0 ;numerator++,dominator--)
        {
            sum2+= ((double)numerator/dominator);
            if(dominator!=0)
            System.out.print( numerator + "/" + dominator + " + ");
            if(dominator==1)
                System.out.print( numerator + "/" + dominator + " = " );
        }
        System.out.printf("%.2f", sum2);

    }
}
