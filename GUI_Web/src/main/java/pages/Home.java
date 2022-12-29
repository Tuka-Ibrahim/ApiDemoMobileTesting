package pages;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Home {
    WebDriver driver;
    By accessibilityBtn=new AppiumBy.ByAccessibilityId("Access'ibility");
    By appBtn=new AppiumBy.ByAccessibilityId("App");


    public Home(WebDriver driver){
        this.driver = driver;
    }

    @Step("Navigate to Access'ibility Page")
    public Accessibility navigateToAccessibilityPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(accessibilityBtn).click();
        return new Accessibility(driver) ;
    }
    @Step("Navigate to App Page")
    public App navigateToAppPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(appBtn).click();
        return new App(driver) ;
    }
    @Step("Navigate to Graphics Page")
    public Graphics navigateToGraphicsPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Graphics")).click();
        return new Graphics(driver);
    }
    @Step("Navigate to Views Page")
    public Views navigateToViewsPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();
        return new Views(driver);
    }

}
