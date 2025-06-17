package junitTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

public class GoogleJUnitTest {

    @Test
    public void openGoogle(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String  baseUrl = ConfigReader.getValue("baseUrl");

        driver.get(baseUrl);
        System.out.println("JUnit : Google Opened");
        driver.quit();

    }

}
