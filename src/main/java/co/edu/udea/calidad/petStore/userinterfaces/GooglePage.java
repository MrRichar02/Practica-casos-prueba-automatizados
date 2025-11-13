package co.edu.udea.calidad.petStore.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GooglePage extends PageObject {
	public static final Target INPUT_TEXT = Target.the("Text Box ini").located(By.name("q"));
	public static final Target LINK_TO_UDEA_HOMEPAGE = Target.the("link to udea site").locatedBy("//h3[contains(@class, 'LC20lb MBeuO DKV0Md')]");
	public static final Target TITLE_PAGE_UDEA = Target.the("U de a's tite").locatedBy("//*[@id='layoutContainers']/div/div[2]/div/div[1]/section/div[2]/header");
}