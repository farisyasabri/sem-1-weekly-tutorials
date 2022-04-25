package farisya;
import java.util.Scanner;
public class revision_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fullname, acc;
        int usage;
        double payment;
        System.out.print("Enter Full Name : ");
        fullname = s.nextLine();
        System.out.print("Enter Account Number : ");
        acc = s.nextLine();
        System.out.print("Enter Total Usage (kWh) : ");
        usage = s.nextInt();

        if (usage>400) {
            payment = (usage-400)*0.416 + 100*0.4 + 100*0.334 + 200*0.218;
        }
        else if (usage>300) {
            payment = (usage-300)*0.4 + 100*0.334 + 200*0.218;
        }
        else if (usage>200) {
            payment = (usage-200)*0.334 + 200*0.218;
        }
        else {
            payment = usage * 0.218;
        }
        if (payment<3) {
            payment=3;
        }
        System.out.println(fullname + " (" + acc + ")");
        System.out.println("Total Usage :" + usage);
        System.out.printf("Total Payment : RM %.2f\n", payment);
    }
}
