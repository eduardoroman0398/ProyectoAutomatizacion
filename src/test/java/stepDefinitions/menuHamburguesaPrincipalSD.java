package stepDefinitions;

import io.cucumber.java.en.And;
import taks.menuHamburguesaTask;

public class menuHamburguesaPrincipalSD {

    @And("hacemos click en menu hamburguesa principal")
    public void clickMenuPrincipal() throws InterruptedException {
        menuHamburguesaTask menu = new menuHamburguesaTask();
        menu.clickMenuHamburguesaPrincipal();

    }
}
