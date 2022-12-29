package pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityNodeProvider {
    WebDriver driver;
    By AccessibilityNodeProvider=new AppiumBy.ByAccessibilityId("Accessibility Node Provider");
    public AccessibilityNodeProvider(WebDriver driver){
        this.driver = driver;
    }
    @Step("Check the text inside Accessibility Node Provider")
    public String verifyTextOnAccessibilityBtn(){
        return driver.findElement(AccessibilityNodeProvider).getText();
    }
}
