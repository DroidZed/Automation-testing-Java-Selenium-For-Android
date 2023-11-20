package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Consts;

public class HomeScreen {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open\"]")
    AndroidTouchAction hamburgerIcon;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Sign In\"]")
    AndroidElement loginText;

    @FindBy(id = Consts.PACKAGE_ID + ":id/logout")
    AndroidElement logoutBtn;

    @FindBy(id = Consts.PACKAGE_ID + ":id/articlesRV")
    AndroidElement articlesRV;

    @FindBy(id = Consts.PACKAGE_ID + ":id/checkArtBtn")
    AndroidElement expectedBtnToFind;

    public HomeScreen(AndroidDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String logout() throws InterruptedException {
        Thread.sleep(1000);
        hamburgerIcon.tap(TapOptions.tapOptions().withTapsCount(1));
        Thread.sleep(1000);
        logoutBtn.click();
        return loginText.getText();
    }

    public String tapOnListItems() throws InterruptedException {
        Thread.sleep(1000);
        MobileElement first = articlesRV.findElement(By
                .xpath(
                        "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"tn.esprit.nebulagaming:id/articlesRV\"]/androidx.cardview.widget.CardView[1]")
        );
        Thread.sleep(1000);
        first.click();
        return expectedBtnToFind.getText();
    }
}
