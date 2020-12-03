package pageobject;

import helper.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpacialOfferPage extends PageHelper {

    private By clickOnWomenTab = By.xpath("xyz");
    private By clickOnSpacialItemLink = By.xpath("");
    private By clickOnItemImage = By.xpath("");

    private WebDriver driver;

    public SpacialOfferPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
    }

    public SpacialOfferPage clickOnWomenTabFromLeftTop() {
        clickOnElement(clickOnWomenTab);
        return new SpacialOfferPage(driver);
    }
}
