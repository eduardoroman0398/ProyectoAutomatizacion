package taks;

import userInterface.accionMenuUI;

public class accionMenuTask {

    public void clickAccionFilters() throws InterruptedException {
        accionMenuUI accion = new accionMenuUI();
        accion.opcion_Filters.click();
        Thread.sleep(2_000);
    }
}
