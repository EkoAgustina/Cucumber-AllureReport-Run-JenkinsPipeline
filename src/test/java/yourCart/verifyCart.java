package yourCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utils.chromeBrowser.wait;

public class verifyCart {
    public WebDriver driver;


    By btnChrt = By.id("checkout");

    public verifyCart(WebDriver driver){
        this.driver=driver;
    }

    public WebElement VerifButtonCheckout(){
        wait.until(ExpectedConditions.elementToBeClickable(btnChrt));


        return null;
    }
}
