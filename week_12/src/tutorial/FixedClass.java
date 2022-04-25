package tutorial;

public class FixedClass implements Interest{
    private double balance;

    public FixedClass(double balance) {
        this.balance = balance;
    }

    public double computeInterest(){
        double total;
        total = balance*0.03/12;
        return total;
    }
}
