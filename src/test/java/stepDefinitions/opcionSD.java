package stepDefinitions;

import io.cucumber.java.en.And;
import taks.opcionTask;

public class opcionSD {

    @And ("seleccionamos la opcion {}")
    public void seleccionamos_opcion(String modulo) throws InterruptedException {
        opcionTask opcion = new opcionTask();
        opcion.clickEnOpcion(modulo);
    }
}
