package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import taks.menuHamburguesaSecundarioTask;
import util.config;

public class menuHamburguesaSecundarioSD {

    @And("cerramos el menu intelica")
    public void cerramos_menu_intelica() throws InterruptedException {
        menuHamburguesaSecundarioTask mHamburguesaSecundario = new menuHamburguesaSecundarioTask();
        mHamburguesaSecundario.click_cerrar_menu();

    }

    @And("clickeamos en el menu hamburguesa secundario")
    public void clickeamos_menu_hamburguesa_secundario() throws InterruptedException {
        menuHamburguesaSecundarioTask mHamburguesaSecundario = new menuHamburguesaSecundarioTask();
        mHamburguesaSecundario.click_menu_hamburguesa();

    }

    @And("seleccionamos la accion Filters {}")
    public void clickeamos_en_una_opcion_filters(String opcionfiltro){
        menuHamburguesaSecundarioTask mHamburguesaSecundario = new menuHamburguesaSecundarioTask();
        mHamburguesaSecundario.seleccionar_una_opcion_del_menu(opcionfiltro);
    }

    @And("seleccionamos brand {}")
    public void selecionamos_brand(String MTU){
        menuHamburguesaSecundarioTask mHamburguesaSecundario = new menuHamburguesaSecundarioTask();
        mHamburguesaSecundario.seleccionar_marca(MTU);
    }


}
