package stepDefinitions;

import io.cucumber.java.en.And;
import taks.idiomaTask;

public class idiomaSD {

    @And("seleccionamos el idioma {}")
    public void seleccionamosidioma(String idioma) throws InterruptedException {
        idiomaTask lenguaje = new idiomaTask();
        lenguaje.idiomaTest(idioma);
    }

}
