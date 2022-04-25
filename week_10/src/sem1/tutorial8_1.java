package sem1;

import java.util.Scanner;

public class tutorial8_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner j = new Scanner(System.in);
        //1(g) object of the class Student
        Student a = new Student();

        System.out.print("Enter contact number : ");
        long num = s.nextLong();
        a.setContactNum(num);
        System.out.println(a.toString());

        //1(h)

        Animal b = new Animal();
        System.out.print("Enter animal: ");
        String ani = j.nextLine();
        b.setMamal(ani);
        System.out.println(b.toString());

        Number c = new Number();
        System.out.print("PRINT NUMBER : ");
        c.getNum();
        System.out.println(c.toString());
    }
}
