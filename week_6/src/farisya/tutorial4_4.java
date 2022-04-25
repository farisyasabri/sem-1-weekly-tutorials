package farisya;

import java.util.Scanner;

public class tutorial4_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] line;
        System.out.print("ENTER 1 SENTENCE :");
        String sentence = s.nextLine();
        //System.out.println(sentence.length());
        line = new String[sentence.length()];
        int count = sentence.length();

        while(count!=0)
        {
            System.out.println(line[count]);
            count--;
        }
    }
}
