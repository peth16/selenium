package testngTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GoogleTestNGTest {

    @Test
    public void openGoogle(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://pwa-dsspr-int.pwa.intershop.de/en/home");
        System.out.println("TestNG: Google Opened");
        driver.quit();

    }

}
