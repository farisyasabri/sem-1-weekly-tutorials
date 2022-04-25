package farisya;


import java.util.Random;

public class lab4_6 {
    public static void main(String[] args) {

        Random n = new Random();
        int num = n.nextInt();
        int j=0;

        if(num<0)
            num=num*-1;

        System.out.println("generated number : " +num);
        do {
            num=num/10;
            j++;
        }
        while(num!=0);

        System.out.println("number of digit : " + j);
    }
}
