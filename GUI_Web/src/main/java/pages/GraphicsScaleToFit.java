package pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class GraphicsScaleToFit {
    WebDriver driver;

    public GraphicsScaleToFit(WebDriver driver){
        this.driver = driver;
    }
    @Step("Get the Text in the header of the page")
    public String GetHeaderOfraphicsScaleToFit() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
        ).getText();
    }
}
