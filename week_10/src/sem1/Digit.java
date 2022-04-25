package sem1;

public class Digit {
    private int storeNum;

    public Digit() {
        storeNum =0;
    }

    public void setStoreNum(int storeNum) {
        this.storeNum = storeNum;
    }

    public int getStoreNum() {
        return storeNum;
    }

    public String toString() {
        String print = "multiplication : " + storeNum;
        return print;
    }
}
