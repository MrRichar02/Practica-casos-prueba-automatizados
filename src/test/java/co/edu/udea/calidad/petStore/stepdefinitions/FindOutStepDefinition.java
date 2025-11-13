package co.edu.udea.calidad.petStore.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.edu.udea.calidad.petStore.questions.Validation;
import co.edu.udea.calidad.petStore.tasks.FindThe;
import co.edu.udea.calidad.petStore.tasks.OpenThe;
import co.edu.udea.calidad.petStore.userinterfaces.GooglePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
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
		student.attemptsTo(OpenThe.navigator(new GooglePage()));
	}

	@When("I type u de a on google chrome")
	public void iTypeUDeAOnGoogleChrome() {
		student.attemptsTo(FindThe.keyword());
	}

	@Then("I can see the udea's official page")
	public void iCanSeeTheUdeaSOfficialPage() {
		GivenWhenThen.then(student).should(GivenWhenThen.seeThat(Validation.theUdeaSite(), Matchers.containsString("Estudiante")));
	}

}
