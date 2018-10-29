import figures.Circle;
import figures.IllegalFigureParamExeption;
import figures.Rectangle;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import static org.testng.AssertJUnit.fail;

public class ExeptionTest {

    @Test(expected = IllegalFigureParamExeption.class)
    public void testException(){
        new Circle(-9);
    }

    @Test
    public void testExceptionMessage() {
        try {
            new Rectangle(1, 0);
            fail("Expected an IllegalFigureParamExeption to be thrown");
        } catch (IllegalFigureParamExeption e) {
            assertThat(e.getMessage(), is("Стороны должны быть положительные"));
        }
    }

}
