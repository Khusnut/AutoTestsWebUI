package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Test1Registration {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments ("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://demowebshop.tricentis.com/");

        WebElement webElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));

        webElement.click();

        driver.findElement(By.id("gender-female")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Test");

        driver.findElement(By.id("FirstName")).sendKeys("Test");

        driver.findElement(By.id("LastName")).sendKeys("Test");

        driver.findElement(By.id("Email")).sendKeys("Test1112344566789999@mail.ru");

        driver.findElement(By.id("Password")).sendKeys("123456");

        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

        driver.findElement(By.id("register-button")).click();

        driver.quit();
    }
}
