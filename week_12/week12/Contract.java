package week12;

public class Contract extends ESS {
    private double sales;

    public Contract(double sales) {
        this.sales = sales;
    }
    public double getSalary(){
        return 500 + sales*0.5;
    }
    public String toString() {
        return "Salary : " + getSalary();
    }
}