package sem1;

public class Payment {
    private int chequeNum, vCode;
    private double amount;
    private String holderName, expDate, cardType;

    public Payment() {
        amount=0;
        chequeNum=0;
        vCode=0;
        holderName="";
        expDate = "";
        cardType = "";
    }

    public Payment(double amount, int chequeNum, int vCode, String holderName, String expDate, String cardType) {
        this.amount = amount;
        this.chequeNum = chequeNum;
        this.vCode = vCode;
        this.holderName = holderName;
        this.expDate = expDate;
        this.cardType = cardType;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setChequeNum(int chequeNum) {
        this.chequeNum = chequeNum;
    }

    public void setvCode(int vCode) {
        this.vCode = vCode;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
