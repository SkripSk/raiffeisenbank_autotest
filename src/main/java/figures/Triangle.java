package figures;

import static java.lang.Math.sqrt;

public class Triangle extends Figure{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return sqrt(perimeter() * (perimeter() - side1) * (perimeter() - side2) * (perimeter() - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
