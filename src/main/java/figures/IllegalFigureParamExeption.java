package figures;

public class IllegalFigureParamExeption extends RuntimeException {

    public IllegalFigureParamExeption(String errorMessage) {
        super(errorMessage);
    }
}
