package sem1;

import java.util.Scanner;

public class Fraction {

    private int numerator, denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void inputMethod(){
        Scanner s = new Scanner(System.in);
        System.out.print("Numerator: ");
        int numerator = s.nextInt();
        setNumerator(numerator);
        System.out.print("Denominator: ");
        int denominator = s.nextInt();
        setDenominator(denominator);
        displayGCD();
    }

    public void displayGCD(){
        int num = getNumerator();
        int den = getDenominator();
        do{
            int ans= num%den;
            num=den;
            den=ans;
        }
        while(num%den!=0);

        int newnum = getNumerator()/den;
        int newden = getDenominator()/den;

        System.out.println("lowest terms of fraction : " + newnum + "/" + newden);
    }


}
