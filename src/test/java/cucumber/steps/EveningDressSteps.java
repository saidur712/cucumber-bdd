package cucumber.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobject.checkout.EveningDressesPage;

public class EveningDressSteps {

    @Then("I can see {string} page")
    public void i_can_see_page(String expectedTitle) {
        String ActualTitle= new EveningDressesPage(CommonSteps.webDriver).getEveningPageTitle();
        Assert.assertEquals("",expectedTitle,ActualTitle);
    }

}
