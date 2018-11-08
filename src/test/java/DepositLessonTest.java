import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositLessonTest extends BaseTest {


    @Test
    public void testDeposit() {
        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
        //acceptRegion();
    }

    private void acceptRegion() {
        click(getDriver().findElement(By.xpath("//*[text(),'Да']")));
    }

}
