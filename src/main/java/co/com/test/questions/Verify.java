package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static co.com.test.utils.Constants.LINK_WEB_PAGE_FACEBOOK;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Verify implements Question<Boolean>  {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = getDriver();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("la pagina actual es : "+currentUrl);
        boolean result;
        if (currentUrl.equals(LINK_WEB_PAGE_FACEBOOK)){
            result =true;
             }else {
            result=false;

        }
        return result;
    }

    public static Verify toThe(){
        return new Verify();
    }
}
