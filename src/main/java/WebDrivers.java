import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDrivers {
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void modalOpening() {
        driver.get("https://ithillel.ua/");
        driver.findElement(By.xpath("//li[@class='site-nav-menu_item -blog']")).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement mailingPopup = driver.findElement(By.xpath("//div[@class='widget-mailing-popup popup -show']"));
        Assertions.assertTrue(mailingPopup.isDisplayed());
    }
    @Test
    public void advert() {
        driver.get("https://ithillel.ua/");
        driver.findElement(By.xpath("//input[@id='input-email-mailing']")).click();
        WebElement emailField = driver.findElement(By.xpath("//input[@id='input-email-mailing']"));
        emailField.sendKeys("qwe@gmail.com");
        Assertions.assertTrue(emailField.isDisplayed());
    }
}
