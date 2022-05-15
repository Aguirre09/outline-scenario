package co.com.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IndexPages extends PageObject {
 public static final Target SOCIAL_NETWORK = Target.the("Type of social network")
         .locatedBy("//a[starts-with(@title, normalize-space('{0}'))]");
}
