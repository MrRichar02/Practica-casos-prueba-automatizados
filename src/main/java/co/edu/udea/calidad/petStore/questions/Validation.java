package co.edu.udea.calidad.petStore.questions;

import co.edu.udea.calidad.petStore.userinterfaces.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Validation implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		String msg = BrowseTheWeb.as(actor).find(GooglePage.TITLE_PAGE_UDEA).getText();

		return msg;
	}

	public static Validation theUdeaSite(){
		return new Validation();
	}

}