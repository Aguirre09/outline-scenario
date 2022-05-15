package co.com.test.tasks;

import co.com.test.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {
    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Open.url(Constants.LINK_WEB_PAGE)
        );
    }
    public  static  OpenWeb theWeb(){
        return instrumented(OpenWeb.class);
    }
}
