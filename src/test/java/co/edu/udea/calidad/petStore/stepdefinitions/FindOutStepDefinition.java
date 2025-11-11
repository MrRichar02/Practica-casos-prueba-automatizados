package co.edu.udea.calidad.petStore.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class FindOutStepDefinition {

	public final Actor student = Actor.named("sara");
	@Managed(driver = "chrome", uniqueSession = true)
	public WebDriver theDriver;

	@Before
	public void config() {
		student.can(BrowseTheWeb.with(theDriver));
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("user");
	}

	@Given("I am in the google page")
	public void iAmInTheGooglePage() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I type u de a on google chrome")
	public void iTypeUDeAOnGoogleChrome() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can see the udea's official page")
	public void iCanSeeTheUdeaSOfficialPage() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
