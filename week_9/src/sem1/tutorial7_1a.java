package sem1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class tutorial7_1a {
    public static void main(String[] args) {

        //1(a) Store ten random integers within 0 to 1000 to a text file name integer.txt
        Random r = new Random();
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("integer.txt"));
            for (int i = 0; i < 10; i++) {
                int num = r.nextInt(10001);
                out.print(num + " ");
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        //1(b) Read from the text file generated in a. Display all the integer and the largest
        //integer
        int max=0;//=0;
        try{
            Scanner in = new Scanner(new FileInputStream("integer.txt"));
            Scanner in2 = new Scanner(new FileInputStream("integer.txt"));
            while (in.hasNextInt()) {
                System.out.print(in.nextInt() + " ");
            }
            while (in2.hasNextInt()){
                int num = in2.nextInt();
                if (max<num)
                    max=num;
            }

            in.close();
            System.out.println("max num = " + max);

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
