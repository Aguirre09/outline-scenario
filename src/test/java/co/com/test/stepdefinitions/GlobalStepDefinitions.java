package co.com.test.stepdefinitions;

import co.com.test.questions.VerifyUrl;
import co.com.test.tasks.ClickWebSite;
import co.com.test.tasks.OpenWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.regex.Matcher;

import static co.com.test.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GlobalStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("user is on Login Page")
    public void userIsOnLoginPage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(OpenWeb.theWeb());
    }

    @When("user enters select social network(.*)")
    public void userEntersSelect(String socialNetwork) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickWebSite.toPage(socialNetwork)
        );
    }

    @Then("user should able to see the (.*)")
    public void userShouldAbleToSeeThe(String linkSocialNetwork) {
       theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyUrl.verifyTheURl(linkSocialNetwork), Matchers.is(true)));
    }
}