package atest;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test1 {
    public static WebDriver driver;

    @BeforeClass
    public static void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/yandexdriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
        auth();
    }

    public static void auth() throws InterruptedException {

        WebElement login = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        login.sendKeys("problem_user");
        Thread.sleep(2000);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys("secret_sauce");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        submit.click();
        Thread.sleep(2000);
    }

    @org.junit.Test
    public void addToCard() {
        try {
            WebElement btatc1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
            btatc1.click();
            Thread.sleep(1000);
            WebElement btatc2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
            btatc2.click();
            Thread.sleep(1000);
            WebElement btatc3 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
            btatc3.click();
            Thread.sleep(1000);
            WebElement btatc4 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
            btatc4.click();
            Thread.sleep(1000);
            WebElement btatc5 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
            btatc5.click();
            Thread.sleep(1000);
            WebElement btatc6 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
            btatc6.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);

        } finally {
            driver.quit();
        }
    }

}