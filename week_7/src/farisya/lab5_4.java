package farisya;

import java.util.Random;

public class lab5_4 {
    public static void main(String[] args) {

        Random r = new Random();
        int[][] matrix = new int[3][3];
        int i,j;

        System.out.println("MATRIX 3 BY 3 :\n");
        for (i =0; i<3 ;i++)
        {
            for (j=0; j<3;j++)
            {
                matrix[i][j] = r.nextInt(10);
                System.out.print(matrix[i][j] + "       ");
                if(j==2)
                    System.out.println();
            }
        }

        System.out.println("\nrotate 90 degree clockwise:\n");

        for (j=0; j<3; j++)
        {
            for (i=2; i>=0; i-- )
            {
                System.out.print(matrix[i][j]+ "       ");
                if (i==0)
                    System.out.println("");
            }
        }
    }
}
