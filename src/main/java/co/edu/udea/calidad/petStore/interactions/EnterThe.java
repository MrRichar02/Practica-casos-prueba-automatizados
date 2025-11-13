package co.edu.udea.calidad.petStore.interactions;

import org.openqa.selenium.Keys;

import co.edu.udea.calidad.petStore.userinterfaces.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterThe implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(" U de A").into(GooglePage.INPUT_TEXT));
		actor.attemptsTo(Enter.keyValues(Keys.RETURN).into(GooglePage.INPUT_TEXT));
		try {
			Thread.sleep(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(GooglePage.LINK_TO_UDEA_HOMEPAGE));
		
	}

	public static EnterThe worldToFine(){
		return Tasks.instrumented(EnterThe.class);
	}

}