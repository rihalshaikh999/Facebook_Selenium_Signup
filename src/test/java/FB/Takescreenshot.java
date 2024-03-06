package FB;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class Takescreenshot
{
    public WebDriver driver;
    @Test
    public void TakeSc() throws IOException
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File SFile=ts.getScreenshotAs(OutputType.FILE);
        File DFile=new File("C:\\Users\\rihal\\IdeaProjects\\FB_SignUpLogin\\Screenshots\\"+"facebook.jpg");
        FileHandler.copy(SFile, DFile);
    }
}
