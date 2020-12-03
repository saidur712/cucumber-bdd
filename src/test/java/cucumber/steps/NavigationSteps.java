package cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.NavigationPage;

public class NavigationSteps {

    @Given("I navigate to the 'Automation practice' website")
    public void i_navigate_to_the_website() {

        CommonSteps.webDriver.navigate().to("http://automationpractice.com");
    }

    @Then("I hover over 'WOMEN' tab")
    public void i_hover_over_tab() {
        new NavigationPage(CommonSteps.webDriver).hoverOverWomenTab();
    }

    @Then("I click on'Evening Dresses' link")
    public void i_click_on_evening_dresses_link() {
        new NavigationPage(CommonSteps.webDriver).clickOnEveningDressesLink();
    }

    @Then("I click on 'WOMEN' tab from top left of the page")
    public void i_click_on_tab_from_top_left_of_the_page() {
        new NavigationPage(CommonSteps.webDriver).clickOnWomenTabFromLeftTop();
    }

    @Then("I verify signal item shows in 'SPACIAL' section bottom left of the page")
    public void i_verify_signal_item_shows_in_section_bottom_left_of_the_page(String string) {
        new NavigationPage(CommonSteps.webDriver).clickOnSpecialLink();

    }

    @Then("i click on the item {string}")
    public void i_click_on_the_item(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I close the {string}")
    public void i_close_the(String string) {
        throw new io.cucumber.java.PendingException();
    }

}
