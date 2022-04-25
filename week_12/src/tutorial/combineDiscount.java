package tutorial;

public class combineDiscount extends BulkDiscount, OtherDiscount {

    public double countMaximum(double OtherDiscount,double BulkDiscount){
        double maximum;
        if (OtherDiscount>BulkDiscount)
            maximum=OtherDiscount;
        else
            maximum=BulkDiscount;
        return maximum;
    }
}
