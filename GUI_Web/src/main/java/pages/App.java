package pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class App {
    WebDriver driver;
    By activityBtn=new AppiumBy.ByAccessibilityId("Activity");


    public App(WebDriver driver){
        this.driver = driver;
    }
    @Step("Navigate to Activity Page")
    public Activity navigateOnActivityPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(activityBtn).click();
        return new Activity(driver);
    }
}
