package TestPackage;

import Actions.MobileActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClass {
    WebDriver driver;
    Home home;
    Accessibility accessibility;
    AccessibilityNodeProvider accessibilityNodeProvider;
    CustomTittle customTittle;
    CheckBoxPage checkBoxPage;
    Graphics graphics;
    GraphicsScaleToFit graphicsScaleToFit;
    Views views;


    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "/src/test/resources/testDataFiles/ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Demo");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        home=new Home(driver);
        accessibilityNodeProvider=new AccessibilityNodeProvider(driver);
        customTittle=new CustomTittle(driver);
        checkBoxPage=new CheckBoxPage(driver);
        graphics=new Graphics(driver);
        graphicsScaleToFit=new GraphicsScaleToFit(driver);
        views=new Views(driver);
        new MobileActions(driver);
    }
    @Test
    public void testClickAction() {
        home.navigateToAccessibilityPage();
        String accessibility=accessibilityNodeProvider.verifyTextOnAccessibilityBtn();
        Assert.assertEquals(accessibility, "Accessibility Node Provider");
    }
    @Test
    public void testTyping() {
        home.navigateToAppPage()
                .navigateOnActivityPage()
                .navigateOnCustomTittlePage();
        Assert.assertEquals(customTittle.TypeAppiumOnCustomTittlePage().getTextOnChangeLeftBtn(),("Appium"));
    }
    @Test
    public void testCheckBox() {
        home.navigateToAccessibilityPage()
                .navigateToAccessibilityNodeQueryingPage();
        String attributeForCheckBoxElement=checkBoxPage.getAttributeForCheckBoxElement();
        Assert.assertEquals(attributeForCheckBoxElement,"true");
    }
    @Test
    public void testScrolling() {
        home.navigateToGraphicsPage().
                scrollDown("ScaleToFit").
                clickOnScaleToFitBtn();
        Assert.assertEquals(graphicsScaleToFit.GetHeaderOfraphicsScaleToFit(),"Graphics/ScaleToFit");
        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
    }
    @Test
    public void testSwiping() {
        home.navigateToGraphicsPage()
                .scrollDown("Vertices")
                .navigateOnVerticesPage()
                .swipeRight()
                .swipeLeft();
    }
    @Test
    public void testRadioButton() {
        home.navigateToViewsPage().
                scrollDown("Radio Group")
                .navigateToRadioGroup();
        String textOnRadioBtn=views.getAttributeForRadioButtonElement();
        Assert.assertEquals(textOnRadioBtn,"true");
    }
    @AfterMethod(description = "Teardown Browser instance.")
    public void afterMethod() {
        driver.quit();
    }
}
