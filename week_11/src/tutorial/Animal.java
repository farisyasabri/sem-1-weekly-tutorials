package tutorial;

public class Animal extends Organism {
    private int numEat;

    public Animal(int size, double growthRate, int numEat) {
        super(size,growthRate);
        this.numEat=numEat;
    }

    public String toString() {
        return super.toString()+ "\namount of eating : "+ numEat;
    }
}
