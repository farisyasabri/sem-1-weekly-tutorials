package sem1;

public class Coordinate_System {

    private int x;
    private int y;

    public Coordinate_System() {
        x=0;
        y=0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y+ ")";
    }
}
