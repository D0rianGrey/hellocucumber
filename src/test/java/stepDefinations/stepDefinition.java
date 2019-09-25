package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is NetBanking landing page$")
    public void user_is_netbanking_landing_page() throws Throwable {
        throw new PendingException();

        //code to navigate to ogin url
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        throw new PendingException();

        //code to login
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        throw new PendingException();

        //home page validation
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        throw new PendingException();

        //validation he cards
    }

}
