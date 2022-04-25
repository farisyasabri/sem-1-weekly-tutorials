package farisya;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class lab3_6 {
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        System.out.print("Enter Radius of the circle : ");
        int radius = r.nextInt();
        System.out.println("Enter coordinate of the circle (x,y) :");
        System.out.print("x : ");
        int x = r.nextInt() ;
        System.out.print("y : ");
        int y = r.nextInt();


        double d = sqrt(x*x + y*y);

        if(d<radius)
            System.out.printf("\nThe point ( %d , %d ) is inside the circle.", x, y);
        else if (d>radius)
            System.out.printf("\nThe point ( %d , %d ) is outside the circle.",x ,y);
        else
            System.out.println("The point is on the line of the circle.");

    }
}
