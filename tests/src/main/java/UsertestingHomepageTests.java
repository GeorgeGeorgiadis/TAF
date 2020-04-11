import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UsertestingHomepageTests extends BaseTest {

    @Test
    public void homepageTests() {
        UsertestingHomepage usertestingHomepage = new UsertestingHomepage(getDriver());
        usertestingHomepage.waitForElementToAppear(By.linkText("LOG IN"));
        usertestingHomepage.clickOnLoginButton();
    }
}