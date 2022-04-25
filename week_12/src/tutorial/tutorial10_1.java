package tutorial;

public class tutorial10_1 {
    public static void main(String[] args) {

        BulkDiscount a =new BulkDiscount(5,0.4);
        OtherDiscount b = new OtherDiscount();
//        combineDiscount c = new combineDiscount();
        getDiscount(a);
        getDiscount(b);
//        System.out.println(Maximum(c);
    }

    public static void getDiscount(DiscountPolicy a){
        a.computeDiscount(5,25);
    }

//    public static void Maximum(DiscountPolicy b){
//        b.countMaximum();
//    }

}
