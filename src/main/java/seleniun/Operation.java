package seleniun;

public abstract class Operation {

    private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public abstract void colculateResult();
}
