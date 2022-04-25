package farisya;

import java.util.Random;

public class lab5_2 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] non_duplicate_num = new int[10];
        //System.out.println(non_duplicate_num[0]);
        int i,j;

        for (i=0;i<10;i++) {
            non_duplicate_num[i] = r.nextInt(21);
            if (i>0) {
                for (j =i-1 ; j >= 0; j--){
                    if (non_duplicate_num[i] == non_duplicate_num[j]) {
                        i--;
                    }
                }
            }
        }
        for (i=0;i<10;i++)
        {
            System.out.println(non_duplicate_num[i]);
        }
    }
}
