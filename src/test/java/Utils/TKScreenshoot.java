package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

import static Utils.chromeBrowser.driver;

public class TKScreenshoot {

    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
}
