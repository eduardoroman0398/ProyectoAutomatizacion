package stepDefinitions;

import io.cucumber.java.en.And;
import taks.accionMenuTask;

public class accionMenuSD {
    @And("seleccionamos la accion Filters")
    public void seleccionamos_accionFilters() throws InterruptedException {
        accionMenuTask accion = new accionMenuTask();
        accion.clickAccionFilters();
    }
}
