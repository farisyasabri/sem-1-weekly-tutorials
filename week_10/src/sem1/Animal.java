package sem1;

public class Animal {

    private String mamal;

    public Animal() {
        mamal= "";
    }

    public Animal(String mamal) {
        this.mamal = mamal;
    }

    public void setMamal(String mamal) {
        this.mamal = mamal;
    }

    public String getMamal() {
        return mamal;
    }

    public String toString() {
        String str = mamal;

        return str;
    }
}
