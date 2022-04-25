package sem1;

import java.io.*;
import java.util.Scanner;

public class lab7_1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            out.writeUTF("WXES1116");
            out.writeUTF("Programming I");
            out.writeUTF("WXES1115");
            out.writeUTF("Data Structure");
            out.writeUTF("WXES1110");
            out.writeUTF("Operating System");
            out.writeUTF("WXES1112");
            out.writeUTF("Computing Mathematics I");
            out.close();
        }catch (IOException e){
            System.out.println("problem with output file");
        }


        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        System.out.print("Enter course code : ");
        String code = s.nextLine();
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("coursename.dat"));
            try {
                while (true) {
                    if (code.equals(in.readUTF())) {
                        System.out.println(in.readUTF());
                        break;
                    }
                }
            }catch (EOFException e){
                System.out.println("CODE NOT FOUND");
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("problem with file input");
        }

    }
}
