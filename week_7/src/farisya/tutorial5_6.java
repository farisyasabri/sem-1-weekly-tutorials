package farisya;

import java.util.Random;

public class tutorial5_6 {
    public static void main(String[] args) {
        //Write the statements that generate 1 random integer within 0 – 255. Convert the
        //number to binary and store the bit into an 8 bit array. Then, display the binary
        //number

        Random r = new Random();
        int decimal = r.nextInt(256);
        int[] binary = new int[8];

        System.out.println("decimal: " + decimal);
        int decimal2 = decimal;
        int count = 7;
        for (int i= decimal;decimal2!=0;i--,count--)
        {
            decimal2=decimal2/2;            // another way divide i/2
            decimal= decimal%2;             // i%2
            binary[count] = decimal;
            decimal=decimal2;
        }

        System.out.print("binary : ");
        for (count=0 ;count<8;count++)
            System.out.print(binary[count]);
    }
}
