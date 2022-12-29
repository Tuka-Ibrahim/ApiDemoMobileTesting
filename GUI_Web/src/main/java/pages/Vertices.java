package pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Vertices {
    WebDriver driver;
    By verticesPage = new AppiumBy.ByAccessibilityId("Vertices");

    public Vertices(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Navigate to Vertices Page")
    public Vertices navigateOnVerticesPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("verticesPage")).click();
        return this;
    }

    @Step("Swipe Right")
    public Vertices swipeRight() {
        MobileActions.swipeRightOnElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View"),driver);
        return this;
    }
    @Step("Swipe Left")
    public Vertices swipeLeft() {
        MobileActions.swipeLeftOnElement(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.View")),driver);
        return this;
    }

}
