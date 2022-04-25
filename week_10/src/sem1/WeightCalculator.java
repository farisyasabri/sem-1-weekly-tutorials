package sem1;

import java.util.Scanner;

public class WeightCalculator {
    private int age, height;

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void inputMethod(){
        Scanner s = new Scanner(System.in);
        System.out.print("Age: ");
        int age = s.nextInt();
        setAge(age);
        System.out.print("Height: ");
        int height = s.nextInt();
        setHeight(height);
    }

    public double recommendWeight(){
        double calc = (getHeight() - 100 + getAge() /10) * 0.9;
        return calc;
    }


    public String toString() {
        String str1 = "Age: " + getAge() + "\n";
        String str2 = "Height: " + getHeight() + "\n";
        String str3 = "Recommended Weight: " + recommendWeight() + "\n";
        return str1 + str2 + str3;
    }
}
