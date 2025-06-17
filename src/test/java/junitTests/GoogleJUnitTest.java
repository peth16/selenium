package junitTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleJUnitTest {

    @Test
    public void openGoogle(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://pwa-dsspr-int.pwa.intershop.de/en/home");
        System.out.println("JUnit : Google Opened");
        driver.quit();

    }

}
