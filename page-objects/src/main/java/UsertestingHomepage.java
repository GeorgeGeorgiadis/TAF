import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsertestingHomepage extends BasePage {

    //Log In Button
    @FindBy(how = How.LINK_TEXT, using = "LOG IN")
    private WebElement loginButton;

    public UsertestingHomepage(WebDriver driver) {
        super(driver);
        driver.get("https://www.usertesting.com");
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}