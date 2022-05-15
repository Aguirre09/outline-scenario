package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.test.userinterfaces.IndexPages.SOCIAL_NETWORK;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ClickWebSite implements Task {

    private String pages;

    public ClickWebSite(String pages) {
        this.pages = pages;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String withoutSpaces=pages.replace("\"", "");
        actor.attemptsTo(Click.on(SOCIAL_NETWORK.of(withoutSpaces)));
        for (String winHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(winHandle);
        }
    }
    public static ClickWebSite toPage(String pages){
        return instrumented(ClickWebSite.class,pages);
    }
}
