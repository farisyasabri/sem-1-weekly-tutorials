package tutorial;

public class BulkDiscount extends DiscountPolicy{

    private int minimum;
    private double discountRate;

    public BulkDiscount(int minimum, double discountRate) {
        this.minimum = minimum;
        this.discountRate = discountRate;
    }

    public void computeDiscount(int count, double itemCost){
        double discount;
        double total;
        if (count>=minimum) {
            discount= count*itemCost*(discountRate);
            total=count*itemCost-discount;
        }
        else
            total=count*itemCost;

        System.out.println("total of purchases: " + total);
    }
}
