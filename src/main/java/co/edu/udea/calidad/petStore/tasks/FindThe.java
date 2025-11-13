package co.edu.udea.calidad.petStore.tasks;

import co.edu.udea.calidad.petStore.interactions.EnterThe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FindThe implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(EnterThe.worldToFine());
		
	}

	public static FindThe keyword(){
		return Tasks.instrumented(FindThe.class);
	}

}

