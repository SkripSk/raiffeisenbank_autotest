package figures;

public class Main {

    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(2,3,4,5);
        Quadrilateral foursquare = new Quadrilateral(2);
        Quadrilateral rectangle = new Quadrilateral(2,6);

        System.out.println(quadrilateral.area());
        System.out.println(quadrilateral.perimeter());
    }

}
