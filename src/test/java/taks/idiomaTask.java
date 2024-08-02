package taks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import userInterface.idiomaUI;
import util.config;

import java.util.Objects;

public class idiomaTask extends config {

    public void idiomaTest(String idioma) throws InterruptedException {

        if (Objects.equals(idioma, "ESP")) {
            idiomaUI seleccionar = new idiomaUI();
            seleccionar.idioma.click();
            Thread.sleep(50_000);

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(10_000);

            actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(10_000);
            System.out.println("Idioma en " + idioma);
        } else {
            System.out.println("Idioma en " + idioma);
            Thread.sleep(10_000);
        }

    }


}
