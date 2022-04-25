package sem1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class lab7_6 {
    public static void main(String[] args) {
        try{
            Scanner order_in = new Scanner(new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\week_9\\Lab07\\order.txt"));

            Scanner countproduct_in = new Scanner(new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\week_9\\Lab07\\product.txt"));

            int numproduct = 0;
            while (countproduct_in.hasNextLine()){
                countproduct_in.nextLine();
                numproduct++;
            }
            countproduct_in.close();

            Scanner listproduct_in = new Scanner(new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\week_9\\Lab07\\product.txt"));
            String[][] product_spl = new String[numproduct][];
            for (int i=0;i<numproduct;i++) {
                product_spl[i] = listproduct_in.nextLine().split(",");
            }

            while (order_in.hasNextLine()){
                String[] order = order_in.nextLine().split(",");

                for (int i = 0; i<order.length; i++){
                    if (order[1].equalsIgnoreCase(product_spl[i][0])){
                        double price = Integer.parseInt(order[2])*Double.parseDouble(product_spl[i][2]);
                        System.out.printf("%-20s%-20s%20s%-20s%-20.2f\n",product_spl[i][0],product_spl[i][1],order[2],product_spl[i][2],price);
                    }
                }
            }
            order_in.close();
            listproduct_in.close();
        }catch(IOException e){
            System.out.println("problem with output file");
        }
    }
}
