package figures;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double a) {
        if (a <= 0)
            throw new IllegalFigureParamExeption("Стороны должны быть положительные");
        else {
            this.a = a;
            this.b = a;
        }
    }

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new IllegalFigureParamExeption("Стороны должны быть положительные");
        else {
            this.a = a;
            this.b = b;
        }
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }
}
