package farisya;

import java.util.Scanner;

public class tutorial5_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //1(a) Declare an array that used to store 12 floating point numbers
        double[] numbers = new double[12];
        System.out.println("enter 12 numbers:");
        for (int i=0; i<12;i++)
        numbers[i] = s.nextDouble();

        //1(b) Initialize an array that used to store the value of A to E
        char[] alp = {'A','B','C','D','E'};
        for (int i=0; i<5;i++)
            System.out.println(alp[i]);

        //1(c) Declare an array that used to store 100 students name
        int value = 3;
        String[] name = new String[value];
        System.out.println("Enter name of students");
        for (int i=0; i<value; i++)
            name[i]= s.nextLine();

        System.out.println("List of name:");
        for (int i=0; i<5;i++)
            System.out.println(name[i]);

        //1(d) Declare an array for a table with 6 rows 2 columns that used to store integer value
        int[][] num = new int[6][2];
        for (int i=0; i<6; i++)
        {
            for (int j=0; j<2;j++)
            {
                System.out.printf("number [%d][%d] : ",i,j);
                num[i][j] = s.nextInt();
            }
        }

        System.out.println("IN TABLE:");
        for (int i=0; i<6; i++) //print in table
        {
            for (int j=0; j<2;j++)
            {
                System.out.print(num[i][j]+ "   |");
                if (j==1)
                    System.out.println();
            }
        }

        //1(e)
        int[][] matrices = {{6,9},{2,5},{4,6}};
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(matrices[i][j] + "  ");
                if (j==1)
                    System.out.println();
            }
        }

        //1(f) change the number of 1(e)
        System.out.println("modified the numbers:");
        for (int i=0; i<3;i++)
        {
            for (int j=0; j<2;j++)
            {
                matrices[i][j] = s.nextInt();
            }
        }

        for (int i=0; i<3;i++)
        {
            for (int j=0; j<2;j++)
            {
                System.out.print(matrices[i][j]+ "    ");
                if (j==1)
                    System.out.println();
            }
        }

        //1(g) Display all the values of an array name contact in separate lines
        System.out.print("Enter contact name : ");
        String[] contact = new String[1];
        contact[0] = s.nextLine();
        String[] info = contact[0].split(" ");
        for (String nama : info)
        {
            System.out.println(nama);
        }

        //question 3 predict
        int[] marks = new int[5];
        int i = 0, j = 1;
        marks[i] = 12;
        marks[j] = marks[i] + 19;
        marks[j-1] = marks[j] * marks [j];
        marks[j*3] = marks[i+1];
        marks[++j] = marks[i]%5;
        marks[2*j] = marks[j-1];

        for (i=0;i<5;i++)
            System.out.println(marks[i]);


    }
}
