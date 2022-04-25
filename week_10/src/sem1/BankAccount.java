package sem1;

public class BankAccount {
    private String name;
    private int passport, amount,balance,numOfWithdraw,numOfDeposit;

    public BankAccount() {
        name="";
        passport=0;
        amount=0;
        balance=0;
        numOfWithdraw=0;
        numOfDeposit=0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setNumOfWithdraw(int numOfWithdraw) {
        this.numOfWithdraw = numOfWithdraw;
    }

    public void setNumOfDeposit(int numOfDeposit) {
        this.numOfDeposit = numOfDeposit;
    }

    public int getNumOfWithdraw() {
        return numOfWithdraw;
    }

    public int getAmount() {
        return amount;
    }

    public int getNumOfDeposit() {
        return numOfDeposit;
    }

    public void deposit(){
        balance = getAmount()+getNumOfDeposit();
        setAmount(balance);
    }

    public void withdraw(){
        balance = getAmount()-getNumOfWithdraw();
        setAmount(balance);
    }

    public String toString() {

        String toPrint = "Name :" + name+ "\nIC or Passport No : " + passport + "\nCurrent Balance: " + getAmount();

        return toPrint;
    }
}
