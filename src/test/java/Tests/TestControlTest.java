package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestControlTest extends BaseTest {

    @Test
    public void metodaTestControl(){

        WebElement abTestingElement = Driver.findElement(By.xpath("//a[text()='A/B Testing']"));
        abTestingElement.click();

    }
}
