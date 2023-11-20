package testRunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.LoginScreen;

public class LoginTestRunner extends Setup {
    LoginScreen loginScreen;

    @Test(priority = 1)
    public void Login() throws InterruptedException {
        loginScreen = new LoginScreen(driver);
        String result = loginScreen.login();
        Assert.assertEquals(result, "Articles");
    }
}
