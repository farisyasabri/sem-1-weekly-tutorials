package tutorial;

public class Organism {
    private int size;
    private double growthRate;

    public Organism(int size, double growthRate) {
        this.size = size;
        this.growthRate = growthRate;
    }

    public String toString() {
        return "size : " + size + "\ngrowth Rate : " + growthRate ;
    }
}
