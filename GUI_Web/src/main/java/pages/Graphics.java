package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Graphics {
    WebDriver driver;
    By verticesPage = new AppiumBy.ByAccessibilityId("Vertices");

    public Graphics(WebDriver driver){
        this.driver = driver;
    }
    @Step("Scroll down")
    public Graphics scrollDown(String name) {
        MobileActions.scrollDownToSpecificText(name);
        return this;
    }
    @Step("Click on Vertices")
    public Vertices navigateOnVerticesPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(verticesPage).click();
        return new Vertices(driver);
    }
    @Step("Click On ScaleToFit Btn")
    public Graphics clickOnScaleToFitBtn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("ScaleToFit")).click();
        return this;
    }
}
