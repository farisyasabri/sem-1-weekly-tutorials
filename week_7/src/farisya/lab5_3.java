package farisya;

import java.util.Random;
import java.util.Scanner;

public class lab5_3 {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter number of employee: ");
        int num_employee = s.nextInt();

        System.out.printf("employee   |    sun    |    mon    |  tue    |    wed    |    thu   |  fri    |    sat    |   total hours\n");
        int e, h;
        int[][] employee_hours = new int[num_employee][8];

        for(e = 0; e<num_employee ; e++)
        {
            int total_hours = 0;
            System.out.print("employee " + (e+1) + " :   ");
            for (h = 0; h<7 ; h++)
            {
                //int h;
                employee_hours[e][h] = r.nextInt(9);
                System.out.print(employee_hours[e][h] + " hours    ");
                total_hours+=employee_hours[e][h];
                if (h==6)
                    System.out.printf("%7d",total_hours);
            }
            System.out.println();
        }


        // get total hours

    }

}
