package pageobject;

import helper.PageHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.checkout.EveningDressesPage;

public class NavigationPage extends PageHelper {

    private final By womenTabLocator = By.cssSelector("#block_top_menu a[title='Women']");
    private final By eveningDressesLinkLocator = By.linkText("Evening Dresses");

    private By clickOnWomenTab = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    private By clickOnAllSpacialLink = By.xpath("//*[@id=\"special_block_right\"]/div/div/a/span");
    private By clickOnItemImage = By.xpath("");

    private final WebDriver driver;


    public NavigationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public NavigationPage hoverOverWomenTab() {
        moveToElement(womenTabLocator);
        return new NavigationPage(driver);
    }

    public EveningDressesPage clickOnEveningDressesLink() {
        clickOnElement(eveningDressesLinkLocator);
        return new EveningDressesPage(driver);
    }

    public NavigationPage clickOnWomenTabFromLeftTop() {
        clickOnElement(clickOnWomenTab);
        return new NavigationPage(driver);
    }

    public NavigationPage clickOnSpecialLink() {
        clickOnElement(clickOnAllSpacialLink);
        return new NavigationPage(driver);
    }

}
