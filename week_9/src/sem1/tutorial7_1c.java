package sem1;


import java.io.*;
import java.util.Random;

public class tutorial7_1c {
    public static void main(String[] args) {
        Random r = new Random();
        // store 10 random number using binary file
        try{
            ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("integer.dat"));
            for (int i=0; i<10;i++){
                int num = r.nextInt(1001);
                in.writeInt(num);
            }
            in.close();
        }catch (IOException e) {
            System.out.println("problem with output file");
        }

        // print random numbers and the average
        int[] number = new int[10];
        try{
            ObjectInputStream out = new ObjectInputStream(new FileInputStream("integer.dat"));
            ObjectInputStream out2 = new ObjectInputStream(new FileInputStream("integer.dat"));

            //use while loop
            for (int i=0;i<10;i++){
                number[i] =out2.readInt();
            }
            int sum=0;
            for (int i=0;i<10;i++){
                System.out.print(number[i] + " ");
                sum=sum+number[i];
            }
            System.out.println();
            double average = (double)sum/10;
            System.out.println("Average : " + average);

            out.close();
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }catch (IOException e){
            System.out.println("problem with file input");
        }

    }
}
