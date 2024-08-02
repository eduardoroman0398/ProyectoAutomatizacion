package stepDefinitions;

import io.cucumber.java.en.And;
import taks.perfilTask;

public class perfilSD {

    @And("seleccionamos el perfil {}")
    public void perfilStep(String perfil) throws InterruptedException {
        perfilTask test = new perfilTask();
        test.ingresarPerfil(perfil);

    }
}
