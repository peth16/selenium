package testngTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.ConfigReader;

public class GoogleTestNGTest {

    @Test
    public void openGoogle(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String  baseUrl = ConfigReader.getValue("baseUrl");

        driver.get(baseUrl);
        System.out.println("TestNG: Google Opened");
        driver.quit();

    }

}
