package lab;

public class lab9_1 {
    public static void main(String[] args) {

        Rectangle a = new Rectangle("Rectangle",2,3);
        a.computeArea();
        a.computePerimeter();
        System.out.println(a.toString());

        Square b = new Square("square",3);
        b.countArea();
        b.countPerimeter();
        System.out.println(b.toString());

        Circle c = new Circle("Cirle",4);
        c.countArea();
        c.countPerimeter();
        System.out.println(c.toString());

    }
}

class Shape {
    protected String name;
    private double perimeter, area;

//    public Shape() {
//        this.name = "";
//    }

    public Shape(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "name : " + name + "\nperimeter : " + getPerimeter() + "\narea : " + getArea() ;
    }
}

class Rectangle extends Shape{
    private double width, length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

//    public void input(int width, int length){
//        this.width = width;
//        this.length = length;
//    }

    public void computePerimeter(){
        double perimeter = 2*width+ 2*length;
        setPerimeter(perimeter);
    }

    public void computeArea(){
        double area = length+width;
        setArea(area);
    }
}

class Square extends Shape{
    private int length;

    public Square(String name,int length) {
        super(name);
        this.length = length;
    }

    public void countPerimeter(){
        int perimeter = length*4;
        setPerimeter(perimeter);
    }

    public void countArea(){
        int area = length*length;
        setArea(area);
    }
}

class Circle extends Shape{
    private int diameter;

    public Circle(String name,int diameter) {
        super(name);
        this.diameter = diameter;
    }

    public void countPerimeter(){
        double perimeter = 2*Math.PI*(diameter/2);
        setPerimeter(perimeter);
    }

    public void countArea(){
        double area = Math.PI*Math.pow((diameter/2),2);
        setArea(area);
    }
}