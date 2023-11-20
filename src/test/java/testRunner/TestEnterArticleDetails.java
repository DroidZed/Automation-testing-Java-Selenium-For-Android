package testRunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.LoginScreen;

public class TestEnterArticleDetails extends Setup {
    private final HomeScreen homeScreen = new HomeScreen(driver);
    private final LoginScreen loginScreen = new LoginScreen(driver);

    @Test(priority = 1)
    public void LogOut() throws InterruptedException {
       // String result = homeScreen.logout();
      //  Assert.assertEquals(result, "Sign In");
    }

    @Test(priority = 2)
    public void Login() throws InterruptedException {
        String result = loginScreen.login();
        Assert.assertEquals(result, "Articles");
    }

    @Test(priority = 3)
    public void EnterArticle() throws InterruptedException {
        String result = homeScreen.tapOnListItems();
        Assert.assertEquals(result, "Read more");
    }

}
