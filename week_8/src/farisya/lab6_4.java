package farisya;

import java.util.Scanner;

public class lab6_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 positive integer: ");
        int num1= s.nextInt();
        int num2= s.nextInt();
        int factor = gcd(num1,num2);
        System.out.println(factor);
    }

    public static int gcd(int num1, int num2){
        //number 1 must greater than number 2
//        if (num2>num1){
//            int hold =num1;
//            num1 = num2;
//            num2 = hold;
//        }
        //int factor;
        do{
            int ans= num1%num2;
            num1=num2;
            num2=ans;
        }
        while(num1%num2!=0);

        return num2;
    }
}
