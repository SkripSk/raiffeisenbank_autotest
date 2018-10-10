package lambda;


public class Converter {

    @FunctionalInterface
    interface Converteer<F,T>{
        T convert(F from);
    }

    public static void main(String[] args) {
        Converteer<String, Integer> conv = (Integer::valueOf);
        int i = conv.convert("124");
        System.out.println(i + 1);
    }
}
