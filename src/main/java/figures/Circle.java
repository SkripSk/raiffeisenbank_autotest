package figures;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalFigureParamExeption("Стороны должны быть положительные");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
