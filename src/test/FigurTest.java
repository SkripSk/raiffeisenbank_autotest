import figures.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class FigurTest {

    Quadrilateral quadrilateral = new Quadrilateral(2,3,4,5);
    //Quadrilateral foursquare = new Quadrilateral(2);
    Quadrilateral rectangle = new Quadrilateral(2,6);

    @Test
    public void testQuadrilateralArea(){
        Quadrilateral quadrilateral = new Quadrilateral(2,3,4,5);
        Assert.assertEquals(120.0, quadrilateral.area(), 0);
    }

    @Test
    public void testQuadrilateralPerimeter(){
        Quadrilateral quadrilateral = new Quadrilateral(2,3,4,5);
        Assert.assertEquals(14.0, quadrilateral.perimeter(), 0);
    }

    @Test
    public void testFoursquarePerimeter(){
        Quadrilateral square = new Quadrilateral(2);
        Assert.assertEquals(8.0, square.perimeter(), 0);
    }

    @Test
    public void testFoursquareArea(){
        Quadrilateral square = new Quadrilateral(2);
        Assert.assertEquals(4.0, square.area(), 0);
    }
}
