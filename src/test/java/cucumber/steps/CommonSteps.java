package cucumber.steps;

import com.google.common.net.MediaType;
import helper.CommonHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonSteps {
    public static WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = CommonHelper.loadWebDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, String.valueOf(MediaType.PNG), scenario.getName());
        }
        //webDriver.quit();
    }

}
