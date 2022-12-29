package pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckBoxPage {
    WebDriver driver;
    By checkBox=By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]");

    public CheckBoxPage(WebDriver driver){
        this.driver = driver;
    }
    @Step("Click on one element on the checkbox")
    public String getAttributeForCheckBoxElement() {
        driver.findElement(checkBox).click();
        return driver.findElement(checkBox).getAttribute("checked");
    }
}
