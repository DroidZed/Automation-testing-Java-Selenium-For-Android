package testRunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.ArticleScreen;
import screens.HomeScreen;
import screens.LoginScreen;


public class FirstScenarioTest extends Setup {

    LoginScreen loginScreen;

    private HomeScreen homeScreen;

    private ArticleScreen articleScreen;

    @Test(priority = 1, testName = "Log in user")
    public void testLogin() {
        loginScreen = new LoginScreen(driver);
        String result = loginScreen.login();
        Assert.assertEquals(result, "Articles");
    }

    @Test(priority = 2, testName = "Enter article into web page from details screen")
    public void testEnterArticle() {
        homeScreen = new HomeScreen(driver);
        articleScreen = new ArticleScreen(driver);
        String result = homeScreen.tapOnListItems();
        Assert.assertEquals(result, "Read more");
        String articleSite = articleScreen.readArticle();
        Assert.assertEquals(articleSite, "kotaku.com");
    }

    @Test(priority = 3, testName = "Leave article from web page and details screen")
    public void testLeaveArticle() throws InterruptedException {
        articleScreen = new ArticleScreen(driver);
        String result = articleScreen.exitArticlePage();
        Assert.assertEquals(result, "Read more");
        String r2 = articleScreen.upNavigateFromArticleDetails();
        Assert.assertEquals(r2, "Articles");
    }

    @Test(priority = 4, testName = "Log out from app")
    public void testLogOut() {
        homeScreen = new HomeScreen(driver);
        String result = homeScreen.logout();
        Assert.assertEquals(result, "Sign In");
    }
}
