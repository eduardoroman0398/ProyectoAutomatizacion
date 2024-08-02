package stepDefinitions;

import io.cucumber.java.en.And;
import taks.credencialesTask;

public class credencialesSD {

    @And ("Ingresamos {}, {}")
    public void Inicio_sesion(String usuario, String contrasena) throws InterruptedException {
        credencialesTask test = new credencialesTask();
        test.user(usuario);
        test.password(contrasena);
    }
}
