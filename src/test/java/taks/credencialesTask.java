package taks;


import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.credencialesUI;
import util.config;


public class credencialesTask extends config {

    public void user(String usuario) throws InterruptedException {
        credencialesUI user = new credencialesUI();
        wait.until(ExpectedConditions.elementToBeClickable(user.usuario));
        user.usuario.click();
        user.usuario.sendKeys(usuario);
    }

    public void password(String contrasena) throws InterruptedException {
        credencialesUI user = new credencialesUI();
        user.password.click();
        user.password.sendKeys(contrasena);
    }
}
