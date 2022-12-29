package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Views {
    WebDriver driver;
    By radioBtn=new AppiumBy.ByAccessibilityId("Lunch");

    public Views(WebDriver driver){
        this.driver = driver;
    }
    @Step("Scroll down")
    public Views scrollDown(String name) {
        MobileActions.scrollDownToSpecificText(name);
        return this;
    }
    @Step("Click on Radio Group")
    public Views navigateToRadioGroup() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Radio Group")).click();
        return this;
    }
    @Step("Click on one element on the checkbox")
    public String getAttributeForRadioButtonElement() {
        return driver.findElement(radioBtn).getAttribute("checked");
    }

}
