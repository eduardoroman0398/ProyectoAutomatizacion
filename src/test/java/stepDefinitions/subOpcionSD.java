package stepDefinitions;

import io.cucumber.java.en.And;
import taks.subOpcionTask;

public class subOpcionSD {

    @And("seleccionamos la subopcion {}")
    public void seleccionamos_subopcion(String sub_opcion) throws InterruptedException {
        subOpcionTask subopcion = new subOpcionTask();
        subopcion.clickEnSubOpcion(sub_opcion);
    }
}
