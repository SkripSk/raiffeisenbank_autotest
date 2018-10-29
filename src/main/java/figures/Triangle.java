package figures;

import static java.lang.Math.sqrt;

public class Triangle extends Figure{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            throw new IllegalFigureParamExeption("Стороны должны быть положительные");
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    }

    @Override
    public double area() {
        return sqrt((side1 + side2 - side3) * (side1 - side2 + side3) * (- side1 + side2 + side3) * (side1 + side2 + side3)) / 4;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
