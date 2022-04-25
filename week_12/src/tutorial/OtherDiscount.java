package tutorial;

public  class OtherDiscount extends DiscountPolicy {

    public void computeDiscount(int count, double itemCost){
        double discount;
        double total = 0;
        if (count>=1&&count<=2) {
            total = count*itemCost;
        }
        else if (count>=3&&count<=5) {
            discount=count*itemCost*0.1;
            total = count*itemCost-discount;
        }
        else if (count>=6&&count<=8) {
            discount=count*itemCost*0.2;
            total = count*itemCost-discount;
        }
        else if (count>8) {
            discount=count*itemCost*0.3;
            total = count*itemCost-discount;
        }

        System.out.println("total of purchases: " + total);
    }
}
