package FB;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector
{
    public WebDriver driver;

    @Test
    public void fbLoginCssSelector()
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("rihalshaikh751@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("8830540511");
//        driver.findElement(By.cssSelector("button[name='login']")).click();
//        driver.findElement(By.cssSelector("button[name='login'][type='submit']")).click();
//        driver.findElement(By.cssSelector("[name='login'][type='submit']")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        driver.findElement(By.cssSelector("#login")).click(); //not working
    }
}
