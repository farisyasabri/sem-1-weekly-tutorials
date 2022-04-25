package farisya;

import java.util.Scanner;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class lab4_3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num=0,min=0,max=100;
        int i=0, total=0,numsquare, totalnumsquare=0;
        double average, s;

        do{
            System.out.print("Enter a score [negative score to quit] : ");
            num = n.nextInt();

            if(num>min &&num > max)
            {
                max = num;
            }
            if(num<max)
            {
                if(num>0)
                {min=num;}
            }
            if(num>=0)
            {
                total+=num;
                i++;
                numsquare = num*num;
                totalnumsquare += numsquare;
            }
        }
        while (num>=0);

        average = (double)total /i;
        s = sqrt(totalnumsquare-(pow(total,2)/(double)i)/(i-1));

        System.out.println("total scaore : "+ total);
        System.out.println("min score : " + min);
        System.out.println("max score : " + max);
        System.out.println("average   : " + average);
        System.out.println("standard deviation : " + s);

    }
}
