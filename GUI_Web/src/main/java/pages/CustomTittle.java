package pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CustomTittle {
    WebDriver driver;
    By customTittleBtn=new AppiumBy.ByAccessibilityId("Custom Title");
    By leftTextEdit=By.id("io.appium.android.apis:id/left_text_edit");
    By changeLeftBtn=new AppiumBy.ByAccessibilityId("Change Left");
    By leftTextBtn=By.id("io.appium.android.apis:id/left_text");

    public CustomTittle(WebDriver driver){
        this.driver = driver;
    }
    @Step("Navigate to Custom Tittle Page")
    public CustomTittle navigateOnCustomTittle() {
        driver.findElement(customTittleBtn).click();
        return this;
    }
    @Step("Type Appium On Custom Tittle Page")
    public CustomTittle TypeAppiumOnCustomTittlePage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(leftTextEdit).clear();
        driver.findElement(leftTextEdit).sendKeys("Appium");
        driver.findElement(changeLeftBtn).click();
        return this;
    }
    @Step("Get Text on Change Left Button")
    public String getTextOnChangeLeftBtn(){
        return driver.findElement(leftTextBtn).getText();
    }
}
