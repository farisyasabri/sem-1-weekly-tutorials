package farisya;

import java.util.Scanner;

public class lab5_6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate :");
        int number = s.nextInt();

        int[][] pascal = new int[number][number];
        for(int row=0; row<number;row++)
        {
            for (int column = 0; column<=row;column++)
            {
                if (column==0 || column==row)
                pascal[row][column]=1;
                else
                {
                    pascal[row][column] = pascal[row-1][column-1] + pascal[row-1][column];
                }
            }
        }
        for (int row=0;row<number;row++)
        {
            for (int column=0; column<number;column++)
            {
                System.out.printf("%5d",pascal[row][column]);
                if (column==number-1)
                    System.out.println();
            }

        }
    }
}
