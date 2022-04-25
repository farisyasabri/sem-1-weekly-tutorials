package farisya;

import java.util.Scanner;

public class lab4_4 {
    public static void main(String[] args) {

        Scanner y = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = y.nextInt();

        String[] hari ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.print("Enter first day of the year");
        int day = y.nextInt();
        //sun=0, mon=1, tue=2, wed=3, thu=4, fri=5, sat=6;

        if(year%4==0)
        {
            //may
            System.out.println("May");
            int j=1, i=1;
            int may =  day + 121;
            may:
            do {
                for(int first_day=may%7;first_day<7;first_day++)
                {
                    System.out.println("week " +i+ " " + j + " " + hari[first_day]);
                    may++;
                    j++;
                    if(j==32)
                        break may;
                }
                i++;
            }
            while(i<=6);

            //August
            System.out.println("August");
            int k=1, l=1;
            int august =  day + 213;
            august:
            do {
                for(int first_day=august%7;first_day<7;first_day++)
                {
                    System.out.println("week " +l+ " " + k + " " + hari[first_day]);
                    august++;
                    k++;
                    if(k==32)
                        break august;
                }
                l++;
            }
            while(l<=6);
        }
        else
        {
            //may
            System.out.println("May");
            int j=1, i=1;
            int may =  day + 120;
            may:
            do {
                for(int first_day=may%7;first_day<7;first_day++)
                {
                    System.out.println("week " +i+ " " + j + " " + hari[first_day]);
                    may++;
                    j++;
                    if(j==32)
                        break may;
                }
                i++;
            }
            while(i<=6);

            //August
            System.out.println("August");
            int k=1, l=1;
            int august =  day + 212;
            august:
            do {
                for(int first_day=august%7;first_day<7;first_day++)
                {
                    System.out.println("week " +l+ " " + k + " " + hari[first_day]);
                    august++;
                    k++;
                    if(k==32)
                        break august;
                }
                l++;
            }
            while(l<=6);
        }


    }
}
