package farisya;

import java.util.Random;
import java.util.Scanner;

public class tutorial6_1 {
    public static void main(String[] args) {

        //1(a)
        Scanner s = new Scanner(System.in);
        //Random r = new Random();
        System.out.println("enter three numbers: ");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        maxnum(x,y,z);
        System.out.println("the maximum number is " + maxnum(x,y,z));

        //1(b)
        System.out.print("Enter an integer : ");
        int squarenum = s.nextInt();
        square(squarenum);

        //1(c)
        System.out.println("enter k and n : (note that k must be smaller than n)");
        System.out.print("k: ");
        int k=s.nextInt();
        System.out.print("n: ");
        int n=s.nextInt();
        combination(n,k);
        System.out.println(combination(n,k));

        //1(d)

        //1(e)
        System.out.print("Enter any numbers or letters: ");
        String ayat = s.next();
        int totalnum = numofletter(ayat);
        System.out.println("number of letters : " + totalnum);

        //1(f)
        //int[] num = new int[10];
        randomnum();

        //1(g)
        System.out.print("Enter the radius of the circle :");
        int radius = s.nextInt();
        circle(radius);

        //1(h)
        System.out.println("First number that generated twice: " + getrandomtwice());

    }

    //(a) Define a static method that returns the maximum number from 3 integer
    //parameters
    public static int maxnum (int x,int y, int z){
        int num;
        if (x>y && x>z)
            num = x;
        else if (y>x && y>z)
            num = y;
        else
            num = z;
        return num;
    }

    //(b) Define a static method that that determine whether the given integer is a
    //square number
    public static void square(double a){
        double num  = Math.sqrt(a);
        if (a- Math.floor(num)==0)
            System.out.println(a + " is a square number.");
        else
            System.out.println(a + " is not a square number.");
    }

    //(c) Define a static method that use to compute combination function C(n,k).
    //C(n,k) gives the number of different k-element subsets that can be found in a
    //given set of n elements. C(n,k) = n! / (k! (n-k)!
    public static double combination(int n, int k){
        int fact_n = n;
        for (int i = n-1; i>0; i--){
            fact_n = fact_n * i;
        }

        int fact_k =k ;
        for (int i = k-1; i>0 ; i--){
            fact_k = fact_k * i;
        }

        int fact = n-k;
        for (int i = n-k-1; i>0; i--){
            fact = fact * i;
        }

        double total = fact_n/ (fact_k*fact);

        return total;

//        static int nCk(int n, int k){
//            //formula nCr
//            return fact(n)/(fact(k)*fact(n-k));
//        }
//        public static int fact(int n){
//            int res = 1;
//            // 4! = 1x2x3x4
//            for (int i = 2; i <= n; i++){
//                res = res * i; //i increases
//            }
//            return res;
//        }


    }

//    (d) Define a static method that used to determine whether the parameter is a
//    pentagonal number. A pentagonal number is a figurate number that extends
//    the concept of triangular and square numbers to the pentagon

//    static Boolean isPentagonal(double n){ //solution 1
//        double i=1,m;
//        do {
//            m = (3*i*i - i)/2;
//            i++;
//        }
//        while ( m < n );
//        return (m == n);
//    }

//    public static void checkpentagonal(int n){ //solution 2
//        int i=1;
//        do{
//            if(((0.5)*(i*(3*i-1)))==n){
//                System.out.print(n+" is a pentagonal number.");
//                break;
//            }
//            if(((0.5)*(i*(3*i-1)))>n){
//                System.out.print(n+" is not a pentagonal number.");
//                break;
//            }
//            i++;
//        }while(i>0);
//
//    }

//    (e) Define a static method that displays the number of letters and the number of
//    digits of a String parameter
    public static int numofletter(String ayat){
        int count =0;
        String[] split = ayat.split("");
        for (int i=0;i<split.length;i++){
            count++;
        }
        return count;
    }

//    public static void sentence(String a){  //example solution e
//        int cntdigit=0,cntchar=0;
//        for(int i=0;i<a.length();++i){
//            if(a.charAt(i)==' ') continue;
//            else if(Character.isLetter(a.charAt(i)))
//                cntchar++;
//            else if(Character.isDigit(a.charAt(i)))
//                cntdigit++;
//        }
//        System.out.printf("Number of letters in %s: %d\n",a,cntchar);
//        System.out.printf("Number of digits in %s: %d\n",a,cntdigit);
//
//    }


//    public static void countCharInt(String text){  //solution e
//        //char: 65 -> 122 in ASCII
//        //int : 48 -> 57  in ASCII
//        int count_char=0, count_int=0, ascii;
//        for(int i=0; i<text.length(); i++){
//            ascii = text.charAt(i);
//
//            if(ascii >= 65 && ascii <= 122)
//                count_char++;
//            else if(ascii >= 48 && ascii <= 57)
//                count_int++;
//        }
//        //print the counts cuz limited space here
//    }


//    (f) Define a static void method that generates 10 random numbers within 0 to 100
//    to the method’s parameter. The random numbers can be accessed by the main
//    method.
    public static void randomnum(){
        Random r = new Random();
        int[] number = new int[10];
        for (int i =0;i<10; i++){
            number[i] = r.nextInt(101);
        }
        for (int i=0;i<10;i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
//
//    public static void random(int[]num){ //example solution f
//        Random r = new Random();
//        for (int i=0; i<10; i++){
//            num[i]= r.nextInt(101);
//        }
//    }

//    (g) Define a static void method that returns the area and the circumference of a
//    circle given the argument is radius.
    public static void circle(int radius){
        double area = Math.PI*Math.pow(radius,2);
        double circumference = 2*Math.PI*radius;

        System.out.printf("Area of the circle = %.2f \n" ,area);
        System.out.printf("Circumference of the circle = %.2f \n", circumference);
    }

//    Define a static method that generate random number within 0 – 10. The
//    method will return the first random number that generate twice
    public static int getrandomtwice(){
        Random r = new Random();
        System.out.print("number generated: ");
        int num = r.nextInt(10);
        for (int i=0;num!=num ;i++){
            num = r.nextInt(10);
            System.out.print(num + " ");
        }
        return num;
    }


}
























