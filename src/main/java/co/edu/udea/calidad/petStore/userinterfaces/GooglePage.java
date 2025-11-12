package co.edu.udea.calidad.petStore.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GooglePage extends PageObject {
	public static final Target INPUT_TEXT = Target.the("Text Box ini").located(By.name("q"));
}