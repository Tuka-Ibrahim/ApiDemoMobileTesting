package pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Accessibility {
    WebDriver driver;
    By accessibilityBtn=new AppiumBy.ByAccessibilityId("Access'ibility");
    By accessibilityNodeProviderBtn=new AppiumBy.ByAccessibilityId("Accessibility Node Provider");
    By nodeQuery=new AppiumBy.ByAccessibilityId("Accessibility Node Querying");
    public Accessibility(WebDriver driver){
        this.driver = driver;
    }

    @Step("Navigate to Access'ibility Node Provider Page")
    public AccessibilityNodeProvider navigateToAccessibilityNodeProviderPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(accessibilityNodeProviderBtn).click();
        return new AccessibilityNodeProvider(driver) ;
    }
    public AccessibilityNodeQuerying navigateToAccessibilityNodeQueryingPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(nodeQuery).click();
        return new AccessibilityNodeQuerying(driver) ;
    }
}
