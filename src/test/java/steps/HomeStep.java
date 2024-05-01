package steps;

import com.automatisation.test.pageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep {
    private HomePage homePage = new HomePage();

    @Given("the user is on the homepage")
    public void userIsOnTheHomePage() {
        homePage.navigateToHomePage();
    }

    @When("the user clicks on the avatar in the navbar")
    public void userClicksOnAvatar() {
        homePage.openModal();
    }

    @When("the user enters their login")
    public void userEntersLogin() {
        homePage.setUsername("williammengo78@gmail.com");
    }

    @When("the user enters their password")
    public void userEntersPassword() {
        homePage.setPassword("mypassword");
    }

    @When("the user clicks on the login button")
    public void clickLoginButton(){
        homePage.clickLogin();
    }

    @Then("the connection should be established successfully and the test should end")
    public void connectionEstablished(){
        System.out.println("The user is connected.");
    }
}
