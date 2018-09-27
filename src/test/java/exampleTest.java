import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class exampleTest {
    private WebDriver driver;
    private By docsBtn = By.cssSelector(ta("docsBtn"));
    private By quickStartGuideBtn = By.cssSelector(ta("quickStartGuideBtn"));
    private By runBtn = By.cssSelector(ta("runBtn"));
    private By componentsBtn = By.cssSelector(ta("componentsBtn"));
    private By containersBtn = By.cssSelector(ta("containersBtn"));

    //private By runBtn = By.xpath(".//*[@id='s-4518']/div[1]/span[2]");


    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() throws InterruptedException{
        driver.get("http://examples.sencha.com/extjs/");

        driver.findElement(docsBtn).click();
        driver.findElement(quickStartGuideBtn).click();
        //driver.findElement(runBtn).click(); can't click
        //driver.findElement(componentsBtn).click(); can't click
        //driver.findElement(containersBtn).click(); can't click

        Thread.sleep(7000);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
