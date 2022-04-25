package farisya;

import java.util.Scanner;

public class tutorial5_4 {
    public static void main(String[] args) {
        //Write the statements that display the number of occurrence of the word "the" (case
        //sensitive) in a string array name sentence

        Scanner s = new Scanner(System.in);
        String sentence;
        System.out.println("Enter sentences:");
        sentence = s.nextLine();
        int count=0;

        String[] split = sentence.split(" ");
        for (int i = 0; i<split.length;i++)
        {
            if (split[i].equals("the"))
                count++;
        }

        System.out.println("number of occurrence of word 'the' : " + count);
    }
}
