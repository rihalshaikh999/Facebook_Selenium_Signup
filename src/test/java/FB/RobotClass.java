package FB;

import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass
{
    public WebDriver driver;
    @Test
    public void robotClass() throws AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("rihalshaikh751@gmail.co");
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
    }

}
