package testRunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.HomeScreen;

public class LogOutTestRunner extends Setup {

    HomeScreen homeScreen;

    @Test(priority = 1)
    public void LogOut() throws InterruptedException {
        homeScreen = new HomeScreen(driver);
        String result = homeScreen.logout();
        Assert.assertEquals(result, "Sign In");
    }
}
