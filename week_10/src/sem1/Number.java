package sem1;

public class Number {
    private int num, num2;

    public Number(){
        num = 20;
        num2 = 40;
    }

    public Number(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        String printnum = num + " AND " + num2;
        return printnum;
    }
}
