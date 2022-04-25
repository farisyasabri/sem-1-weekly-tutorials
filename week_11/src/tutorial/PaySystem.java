package tutorial;

public class PaySystem {
    private double payRate;
    private int numHours;

    public double totalPay(){
        double total = payRate*numHours;
        return total;
    }

    public String toString() {
        return "Pay rate : " + payRate + "\nnumHours=" + numHours ;
    }
}
