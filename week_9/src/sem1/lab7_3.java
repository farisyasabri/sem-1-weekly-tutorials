package sem1;

import java.io.*;
import java.util.Scanner;

public class lab7_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter sentences: (enter 'end' to finish enter input)");
        String input = s.nextLine();
        savefile(input);
        stringToChar(input);
        Boolean end = true;
        while (end) {
            input = s.nextLine();
            if (input.equalsIgnoreCase("end")){
                break;
            }
            savefile(input);
            stringToChar(input);
            if (input.equalsIgnoreCase("end")){
                end=false;
            }

        }
            //read the original.txt
            System.out.println();
            System.out.println("read the original.txt file");
            try {
                Scanner in = new Scanner(new FileInputStream("original.txt"));
                while (in.hasNextLine()) {
                    System.out.println(in.nextLine());
                }
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println("File was not found");
            }

        }

        public static void savefile (String input){
            try {
                PrintWriter out = new PrintWriter(new FileOutputStream("original.txt", true));
                out.println(input);
                out.close();
            } catch (IOException e) {
                System.out.println("problem with output file");
            }
        }

        public static void stringToChar (String input){
            char[] ch = new char[input.length()];
            for (int k = 0; k < input.length(); k++) {
                ch[k] = input.charAt(k);
            }
            reverse(ch);
        }

        public static void reverse(char[] ch){
            try {
                PrintWriter save = new PrintWriter(new FileOutputStream("reverse.txt",true));
                for (int j = ch.length - 1; j >= 0; j--) {
                    save.print(ch[j]);
                }
                save.close();
            } catch (IOException e) {
                System.out.println("problem with output file");
            }
        }

}
