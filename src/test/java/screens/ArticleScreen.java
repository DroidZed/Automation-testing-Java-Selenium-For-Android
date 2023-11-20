package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Consts;

public class ArticleScreen {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Return to previous app\"]")
    AndroidElement returnToPrevApp;

    @FindBy(id = Consts.PACKAGE_ID + ":id/checkArtBtn")
    AndroidElement expectedBtnToFind;

    @FindBy(id = "org.mozilla.firefox:id/mozac_browser_toolbar_url_view")
    AndroidElement articleSite;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"upBtn\"]")
    AndroidElement upBtn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Articles\"]")
    AndroidElement textToFind;

    public ArticleScreen(AndroidDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String readArticle() {
        expectedBtnToFind.click();
        return articleSite.getText();
    }

    public String exitArticlePage() throws InterruptedException {
        Thread.sleep(1000);
        returnToPrevApp.click();
        return expectedBtnToFind.getText();
    }

    public String upNavigateFromArticleDetails() throws InterruptedException {
        Thread.sleep(1000);
        upBtn.click();
        return textToFind.getText();
    }
}
