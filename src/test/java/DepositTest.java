import org.junit.Test;

import java.util.HashMap;

public class DepositTest {

    @Test
    public void testDeposit() {

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Фамилия", "Иванов");
        testData.put("Имя", "Иван");
        testData.put("Отчество","Иванович");
        testData.put("Дата рождения","09111989");
        testData.put("Телефон","9619592975");
        testData.put("Город", "Москва");


    }
}
