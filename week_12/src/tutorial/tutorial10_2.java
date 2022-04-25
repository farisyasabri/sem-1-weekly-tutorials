package tutorial;

public class tutorial10_2 {
    public static void main(String[] args) {
        SavingAccount a = new SavingAccount(100);
        FixedClass b = new FixedClass(233);
        getInterest(a);
        getInterest(b);
//        System.out.printf("total interest for saving account: %.2f", getInterest(a));
//        System.out.printf("total interest for fixed account : %.2f", getInterest(b));
    }

    public static void getInterest(Interest a){

        System.out.println("the interest " + a.computeInterest());
//        return a.computeInterest(5);
    }
}
