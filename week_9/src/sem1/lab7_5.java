package sem1;

import java.io.*;

public class lab7_5 {
    public static void main(String[] args) {
        //read from binary file named person.dat
        //int totalrecord;
//        int total=0;
//        int[] age = new int[total];
//        String name[] = new String[total];
//        char[] gender = new char[total];
//        int i=1;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\week_9\\Lab07\\person.dat"));
            int totalrecord = in.readInt();
            //int total = totalrecord;
            String[][] record = new String[totalrecord][3];
            System.out.println("number of record : " + totalrecord);
            int row = 0;
            try{
                while (true) {
                    String name = in.readUTF();
                    int age = in.readInt();
                    char gender = in.readChar();

                    record[row][0] = name;
                    record[row][1] = Integer.toString(age);
                    record[row][2] = gender + " ";

                    row++;
                }
            } catch (EOFException e) {

                for (int i=0;i<3;i++) {
                    for (int j = 0; j < record.length-1; j++)
                        //ascending order name
                        if (record[j][0].compareToIgnoreCase(record[j + 1][0]) > 0) {
                            String hold = record[j][0];
                            record[j][i] = record[j + 1][i];
                            record[j + 1][i] = hold;
                        }
                }
                for (int j=0;j<totalrecord;j++){
                    for (int col=0; col<3;col++) {
                        System.out.print(record[j][col]+ " ");
                    }
                    System.out.println();
                }
            }
            in.close();
        }catch (FileNotFoundException e){
            System.out.println("File was not found");
        }catch (IOException e){
            System.out.println("Problem with input file");
        }
    }
}
