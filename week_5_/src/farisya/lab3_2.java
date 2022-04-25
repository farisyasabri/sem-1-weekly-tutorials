package farisya;

import java.util.Random;

public class lab3_2 {
    public static void main(String[] args) {
        Random n = new Random();
        int number = n.nextInt(6);

        switch(number){
            case 1 :
                System.out.println( number + " is one.");
                break;

            case 2 :
                System.out.println( number + " is two.");
                break;

            case 3 :
                System.out.println( number + " is three.");
                break;

            case 4 :
                System.out.println( number + " is four.");
                break;

            case 5 :
                System.out.println( number + " is five.");
                break;

            default:
                System.out.println( number + " is zero.");
                break;
        }

    }
}
