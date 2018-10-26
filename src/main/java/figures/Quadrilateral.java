package figures;

public class Quadrilateral extends Figure {

    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrilateral(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
    }

    public Quadrilateral(double a) {
        this.a = a;
        this.b = a;
        this.c = a;
        this.d = a;
    }

    public Quadrilateral(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        return a * b * c * d;
    }

    @Override
    public double perimeter() {
        return a + b + c + d;
    }
}
