import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleHomepageTests extends BaseTest {

    @Test
    public void homepageTests() {
        GoogleHomepage googleHomepage = new GoogleHomepage(getDriver());
        googleHomepage.waitForElementToAppear(By.linkText("LOG IN"));
        googleHomepage.clickOnLoginButton();

    }
}