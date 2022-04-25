package farisya;

import java.util.Scanner;

public class tutorial5_5 {
    public static void main(String[] args) {
        //Write the statements that display the string array name sentence in reverse order.
        //Each string element must be displayed in reverse order as well.

        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Enter any sentence : ");
        name = s.nextLine();

        String[] inverse = name.split("");
        for (int i=inverse.length-1; i>=0; i--)
            System.out.print(inverse[i]);
    }
}
