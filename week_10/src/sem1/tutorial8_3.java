package sem1;

import java.util.Scanner;

public class tutorial8_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Coordinate_System a = new Coordinate_System();

        System.out.print("Enter coordinate x : ");
        int x = s.nextInt();
        a.setX(x);

        System.out.print("Enter coordinate y : ");
        int y = s.nextInt();
        a.setY(y);

        System.out.println(a.toString());
    }
}
