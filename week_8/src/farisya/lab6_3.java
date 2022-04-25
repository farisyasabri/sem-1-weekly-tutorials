package farisya;

import java.util.Scanner;

public class lab6_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("ENTER 10 INTEGER NUMBERS: ");
        int[] number = new int[10];
        for (int i=0; i<10 ; i++){
            number[i] = s.nextInt();
        }
        reverse(number);
    }

    public static void reverse(int[] number){
        int[] num = new int[10];
        int count= 0;
        for (int i=9; i>=0;i--){
            num[i]= number[count];
            count++;
        }

        for (int j=0; j<10;j++){
            System.out.print(num[j]);
        }
    }

}
;