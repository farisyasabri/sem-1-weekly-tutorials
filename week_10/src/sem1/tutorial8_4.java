package sem1;

import java.util.Scanner;

public class tutorial8_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Payment p = new Payment();
        int chequeNum, vCode;
        double amount;
        String holderName, expDate, cardType;

        System.out.println(" PAYMENT METHOD OPTION");
        System.out.println("1 : CASH PAYMENT");
        System.out.println("2 : CHEQUE PAYMENT");
        System.out.println("3 : CREDIT CARD PAYMENT");
        int method = s.nextInt();

        switch (method){
            case 1 :
                System.out.print("ENTER AMOUNT: ");
                amount = s.nextDouble();
                p.setAmount(amount);
                break;
            case 2 :
                System.out.print("ENTER AMOUNT: ");
                amount = s.nextDouble();
                p.setAmount(amount);
                System.out.print("ENTER CHEQUE NUMBER");
                chequeNum = s.nextInt();
                p.setChequeNum(chequeNum);
                break;
            case 3 :
                System.out.print("ENTER AMOUNT: ");
                amount = s.nextDouble();
                p.setAmount(amount);
                System.out.print("ENTER CARD HOLDER NAME:");
                holderName = s.nextLine();
                p.setHolderName(holderName);
                System.out.print("CARD TYPE: ");
                cardType = s.nextLine();
                p.setCardType(cardType);
                System.out.print("EXPIRATION DATE: ");
                expDate = s.nextLine();
                p.setExpDate(expDate);
                System.out.print("VERIFICATION CODE: ");
                vCode = s.nextInt();
                p.setvCode(vCode);
                break;
            default:
                System.out.println("payment method is not available");
        }
    }
}
