package FB;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath
{
    public WebDriver driver;
    @Test
    public void xPath()
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("rihalshaikh751@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("8830540511");
//        driver.findElement(By.xpath("//button[@name='login'][@type='submit']")).click();
//        WebElement element=driver.findElement(By.xpath("#login"));
        WebElement element=driver.findElement(By.xpath("//button[@name='login'][@type='submit']"));
        element.click();
    }
    @Test
    public void XYCoordinates()
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.name("email")).sendKeys("rihalshaikh751@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("8830540511");
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
        WebElement element=driver.findElement(By.name("email"));
        int x=element.getLocation().getX();
        int y=element.getLocation().getY();
        System.out.println(x);
        System.out.println(y);
    }
}
