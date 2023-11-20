package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Consts;

public class LoginScreen {
    @FindBy(id = Consts.PACKAGE_ID + ":id/emailTf")
    AndroidElement emailTf;
    @FindBy(id = Consts.PACKAGE_ID + ":id/passwordTf")
    AndroidElement passwordTf;
    @FindBy(id = Consts.PACKAGE_ID + ":id/buttonLogin")
    AndroidElement buttonLogin;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Articles\"]")
    AndroidElement txt_toolbar;

    public LoginScreen(AndroidDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String login() {
        emailTf.sendKeys("aymen.dragon5@gmail.com");
        passwordTf.sendKeys("aymen77");
        buttonLogin.click();
        return txt_toolbar.getText();
    }
}

