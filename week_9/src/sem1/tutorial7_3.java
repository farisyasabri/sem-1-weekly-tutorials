package sem1;

import java.io.*;
import java.util.Scanner;

public class tutorial7_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        //convert a sentence into binary number
        int count = str.length();
        char[] charnum = new char[str.length()];
        for (int i=0;i<count;i++){
            charnum[i]=str.charAt(i);
        }

        //store in text file
        try{
            PrintWriter in = new PrintWriter(new FileOutputStream("data.txt"));
            for (int i=0; i< charnum.length;i++){
                String bitnum = Integer.toBinaryString(charnum[i]);
                in.print(bitnum + " ");
            }
            in.close();
        }catch (IOException e){
            System.out.println("problem with file output");
        }

        //read and display file
        try{
            Scanner out = new Scanner(new FileInputStream("data.txt"));
            while (out.hasNextInt()){
                System.out.print(out.nextInt()+ " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}



