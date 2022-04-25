package sem1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lab7_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("ENTER FILE NAME");
        String input  = s.nextLine();

        int word=0;
        int line=0;
        int ch=0;
        try{
            Scanner in = new Scanner(new FileInputStream(input));
            while (in.hasNext()){
                in.next();
                word++;
            }
            BufferedReader in2 = new BufferedReader(new FileReader(input));
            String charcount = in2.readLine();
            //String[] totalchar = new String[charcount.length()];
            while (in2.readLine() != null) {
                line++;
                ch += charcount.length();  //something wrong with counting character
            }
            in2.close();
            in.close();
        }catch (IOException e){
            System.out.println("problem with output file");
        }

        System.out.println("number of character : " + (ch-1));
        System.out.println("number of words : " + word);
        System.out.println("number of line : " + line);

    }
}
