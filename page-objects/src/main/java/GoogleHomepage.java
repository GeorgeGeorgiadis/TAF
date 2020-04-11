import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomepage extends BasePage {

    //Apply as Developer Button
    @FindBy(how = How.LINK_TEXT, using = "LOG IN")
    private WebElement developerApplyButton;

    public GoogleHomepage(WebDriver driver) {
        super(driver);
        driver.get("https://www.usertesting.com");
    }

    public void clickOnLoginButton() {
        driver.findElement(By.linkText("LOG IN")).click();
    }
}