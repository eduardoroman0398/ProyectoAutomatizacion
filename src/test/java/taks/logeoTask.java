package taks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import userInterface.logeoUI;

import static util.config.driver;

public class logeoTask {

    public void logeoTest() throws InterruptedException {

        logeoUI seleccionar = new logeoUI();
        seleccionar.generate_token_boton.click();
        Thread.sleep(2_000);
    }

        /*Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(15_000);

         */
}
