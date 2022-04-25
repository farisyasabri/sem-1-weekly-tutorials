package tutorial;

public class SpecialPay extends PaySystem {
    double payRate;
    int numHours;

    public double PAY(){
        double total = payRate*numHours;
        return total;
    }
}
