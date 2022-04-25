package sem1;

import java.util.Scanner;

public class tutorial8_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Digit a = new Digit();

        System.out.print("Enter any integer number: ");
        int number = s.nextInt();
        a.setStoreNum(number);

        a.setStoreNum(getDigitMultiplication(a.getStoreNum()));
        System.out.println(a.toString());

    }

    public static int getDigitMultiplication(int number){  //this method should be in class digit

        int num = number ;
        int count=0;

        while (num!=0){
            num/=10;
            count++;
        }

        int[] singleDigit = new int[count];
        num = number;
        for (int j=0;j<count;j++){
            singleDigit[j] = num%10;
            num=num/10;
        }

        int multi =1;
        for (int j=0; j<count; j++){
            multi = multi* singleDigit[j];
        }
        return multi;
    }
}
