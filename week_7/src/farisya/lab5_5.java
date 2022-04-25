package farisya;

import java.util.Random;
import java.util.Scanner;

public class lab5_5 {
    public static void main(String[] args) {

        //PROBLEM : BINARY SEARCH

        Random r = new Random();
        int[] number = new int[20];
        int i;

        //generate 20 random numbers
        System.out.println("A list of 20 random intergers within 0 to 100:");
        for (i=0; i<20 ; i++)
        {
            number[i] = r.nextInt(101);
            System.out.print(number[i] + "   ");
        }

        System.out.println("\n");

        // arrange number to descending number
        for (int pass=0; pass< number.length-1; pass++)
        {
            for (i=0; i< number.length-1-pass;i++)
            {
                if (number[i]<number[i+1])
                {
                    int hold = number[i+1];
                    number[i+1] = number[i];
                    number[i] = hold;
                }
            }
        }

        //print descending number
        System.out.println("Array in descending order:");
        for (i=0;i< number.length;i++)
        {
            System.out.print(number[i]+ "   ");
        }

        //ask user to enter number to search
        System.out.print("\nEnter number to search: ");
        Scanner s = new Scanner(System.in);
        int find_num = s.nextInt();

        //linear search
        boolean search= false;
        int count1 =0;
        for (i=0; i< number.length; i++)
        {
            if (number[i]==find_num)
            {
                System.out.println("Linear search : " + find_num + " found !");
                search = true;
                break;
            }
            count1++;
        }
        if (!search)
            System.out.println("Linear search : " + find_num + " not found !");

        //binary search
        int high = number.length-1;
        int low = 0;
        int middle;

        int count2 = 0;
        while (low<=high)
        {
            middle = (low + high)/2;
            if (find_num==number[middle])
            {
                System.out.println("Binary search : " + find_num + " found !");
                count2++;
                search = true;
                break;
            }
            else if (find_num>number[middle])
            {
                low = middle + 1;
                count2++;
            }
            else
            {
                high = middle - 1;
                count2++;
            }
        }
        if (!search)
            System.out.println("Binary search : " + find_num + " not found !");

        //number of loops (count)
        System.out.println("Linear search : " + count1 + " loops ");
        System.out.println("Binary search : " + count2 + " loops ");
    }
}