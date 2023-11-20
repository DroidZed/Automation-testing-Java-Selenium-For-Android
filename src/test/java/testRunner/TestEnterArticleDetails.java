package testRunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.ArticleScreen;
import screens.HomeScreen;

public class TestEnterArticleDetails extends Setup {
    private HomeScreen homeScreen;

    private ArticleScreen articleScreen;

    @Test(priority = 1)
    public void EnterArticle() {
        homeScreen = new HomeScreen(driver);
        articleScreen = new ArticleScreen(driver);
        String result = homeScreen.tapOnListItems();
        Assert.assertEquals(result, "Read more");
        String articleSite = articleScreen.readArticle();
        Assert.assertEquals(articleSite, "kotaku.com");
    }

    @Test(priority = 2)
    public void LeaveArticle() throws InterruptedException {
        articleScreen = new ArticleScreen(driver);
        String result = articleScreen.exitArticlePage();
        Assert.assertEquals(result, "Read more");
        String r2 = articleScreen.upNavigateFromArticleDetails();
        Assert.assertEquals(r2, "Articles");
    }

}
