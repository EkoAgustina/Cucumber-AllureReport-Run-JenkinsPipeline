package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;

public class chromeBrowser {


    public static WebDriver driver = new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, 10);
    @Test

    public static void PathChrome(){
        File filePath = new File(System.getProperty("user.dir"));
        File chromeExe = new File(filePath, "/chromedirver.exe");

        System.getProperty("webdriver-chrome-driver", chromeExe.getAbsolutePath());


    }

}
