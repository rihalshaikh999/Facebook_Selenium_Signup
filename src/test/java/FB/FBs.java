package FB;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class FBs {
    public WebDriver driver;
    @Test
    public void fbSingup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Rihal");
        driver.findElement(By.name("lastname")).sendKeys("Shaikh");
        driver.findElement(By.name("reg_email__")).sendKeys("rihalshaikh751@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rihalshaikh751@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("8830540511");
        driver.findElement(By.id("day")).sendKeys("16");
        driver.findElement(By.id("month")).sendKeys("Jan");
        driver.findElement(By.id("year")).sendKeys("1999"); //
        Thread.sleep(3000);
        WebElement radio = driver.findElement(By.xpath("//label[text()='Male']"));
        radio.click();
        driver.findElement(By.name("websubmit")).click();
    }
    @Test
    public void fbLogin()
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("rihalshaikh751@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("8830540511");
        driver.findElement(By.name("login")).click();
    }



}
