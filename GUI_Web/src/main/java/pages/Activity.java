package pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Activity {
    WebDriver driver;
    By customTittleBtn=new AppiumBy.ByAccessibilityId("Custom Title");


    public Activity(WebDriver driver){
        this.driver = driver;
    }
    @Step("Navigate to Custom Tittle Page")
    public CustomTittle navigateOnCustomTittlePage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(customTittleBtn).click();
        return new CustomTittle(driver);
    }

}
