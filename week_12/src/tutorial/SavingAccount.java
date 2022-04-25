package tutorial;

public class SavingAccount implements Interest {
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    public double computeInterest(){
        double total;
        total=balance*0.005/12;//*year;
        return total;
    }
}
