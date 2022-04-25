package sem1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //lab Q2
     /*   BankAccount a = new BankAccount();
        System.out.print("Name : ");
        String name = s.nextLine();
        a.setName(name);
        System.out.print("IC or Passport No : ");
        int passport = s.nextInt();
        a.setPassport(passport);
        System.out.print("Deposit Amount: ");
        int amount = s.nextInt();
        a.setAmount(amount);
        System.out.println();
        System.out.print("Do you want to continue the transaction? ");
        String answer = s.next();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("ENTER NUMBER");
            System.out.println("1 : withdraw money");
            System.out.println("2 : deposit cash");
            int nextStep = s.nextInt();
            if (nextStep==1){
                System.out.print("ENTER AMOUNT OF WITHDRAWAL: ");
                int withdrawAmount = s.nextInt();
                a.setNumOfWithdraw(withdrawAmount);
                a.withdraw();
            }
            else{
                System.out.print("ENTER NUMBER OF CASH DEPOSIT: ");
                int cashDepositAmount = s.nextInt();
                a.setNumOfDeposit(cashDepositAmount);
                a.deposit();
            }
        }
        else
            System.out.println("THANK YOU");

        System.out.println(a.toString());

        //lab Q3
        WeightCalculator b = new WeightCalculator();
        b.inputMethod();
        System.out.println(b.toString());
*/
        //lab Q4
        Fraction d = new Fraction();
        d.inputMethod();

        //lab Q5
        System.out.print("Player 1 name: ");
        String name1 = s.nextLine();
        Game player1 = new Game(name1);

        System.out.print("Player 2 name: ");
        String name2 = s.nextLine();
        Game player2 = new Game(name2);

        while (player1.score<=100||player2.score<=100){
            player1.move();
            System.out.println(player1.getName()+ " : "+player1.score);
            player2.move();
            System.out.println(player2.getName()+ " : "+player2.score);
            if (player1.score>=100||player2.score>=100)
                break;
        }
        if (player1.score>=100)
            System.out.println(player1.getName() + " win " + player1.score);
        else
            System.out.println(player2.getName()+ "win" + player2.score);

    }
}
