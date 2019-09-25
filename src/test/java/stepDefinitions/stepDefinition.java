package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {


    @Given("^User is NetBanking landing page$")
    public void user_is_netbanking_landing_page() {

        //code to navigate to login url
        System.out.println("navigated to login url");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) {

        System.out.println(strArg1);
        System.out.println(strArg2);

        System.out.println("logged in success");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {


        //home page validation

        System.out.println("Validated home page");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1){

        //validation he cards

        System.out.println("Validated cards");

        System.out.println(strArg1);
    }

}
