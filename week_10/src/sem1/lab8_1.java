package sem1;

public class lab8_1 {
    public static void main(String[] args) {

        Number_lab a = new Number_lab(); // generate 10 random integers within 0 to 100.
        Number_lab b = new Number_lab(5); // generate 5 random integers within 0 to 100.
        Number_lab c = new Number_lab(4, 50); // generate 4 random integers within 0 to 50

        a.toString();
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
