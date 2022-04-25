package farisya;

import java.util.Random;
import java.util.Scanner;

public class lab5_1 {
    public static void main(String[] args) {

        //ask user enter number of student
        Scanner st = new Scanner(System.in);
        int[] student;
        System.out.print("Enter number of student : ");
        int num_of_student = st.nextInt();

        //generate students scores
        int[] score = new int[num_of_student];
        Random sc = new Random();
        for (int i=0; i<num_of_student; i++)
        {
            score[i] = sc.nextInt(101);
            System.out.print("student " + (i+1) + " : ");
            System.out.println(score[i]);
        }

        // bubble sort
        for(int pass=0; pass<score.length-1; pass++) {
            for (int i = 0; i <score.length - 1 - pass; i++) {
                if (score[i] > score[i+1])  {
                    int hold = score[i];
                    score[i] = score[i+1];
                    score[i+1] = hold;
                }
            }
        }

        //get sum of total score
        int total_score=0;
        for(int i=0; i<num_of_student ; i++)
        {
            total_score =+ score[i];
        }

        double average = (double)total_score/num_of_student;

        System.out.println("the lowest score is : " + score[0]);
        System.out.println("the highest score is : " + score[num_of_student-1]);
        System.out.printf("average score : %.2f", average);
    }
}
