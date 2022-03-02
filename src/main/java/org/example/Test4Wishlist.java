package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Test4Wishlist {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://demowebshop.tricentis.com/");

        //Авторизация//

        WebElement webElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));

        webElement.click();

        driver.findElement(By.id("Email")).sendKeys("Test12345678999@mail.ru");

        driver.findElement(By.id("Password")).sendKeys("123456");

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

        //добавление в виш-лист

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")).click();

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[1]/a/img")).click();

        driver.findElement(By.id("addtocart_14_EnteredQuantity")).sendKeys("2");

        driver.findElement(By.id("add-to-wishlist-button-14")).click();

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();

        driver.quit();
    }
}