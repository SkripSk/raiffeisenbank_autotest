import figures.Circle;
import figures.Rectangle;
import figures.Triangle;
import org.junit.Assert;
import org.junit.Test;
import static java.lang.Math.*;

public class FigurTest {

    @Test
    public void testRectangleArea(){
        Rectangle rectangle = new Rectangle(2,6);
        Assert.assertEquals(12.0, rectangle.area(), 0);
    }

    @Test
    public void testRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(2,6);
        Assert.assertEquals(16.0, rectangle.perimeter(), 0);
    }

    @Test
    public void testSquarePerimeter(){
        Rectangle square = new Rectangle(2);
        Assert.assertEquals(8.0, square.perimeter(), 0);
    }

    @Test
    public void testSquareArea(){
        Rectangle square = new Rectangle(2);
        Assert.assertEquals(4.0, square.area(), 0);
    }

    @Test
    public void testCirclePerimeter(){
        Circle circle = new Circle(256);
        Assert.assertEquals(512 * PI, circle.perimeter(), 0);
    }

    @Test
    public void testCircleArea(){
        Circle circle = new Circle(256);
        Assert.assertEquals(65536 * PI, circle.area(),0);
    }

    @Test
    public void testTrianglePerimeter(){
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(12, triangle.perimeter(),0);
    }

    @Test
    public void testTriangleArea(){
        Triangle triangle = new Triangle(3,4,5);
        Assert.assertEquals(6, triangle.area(),0);
    }
}
