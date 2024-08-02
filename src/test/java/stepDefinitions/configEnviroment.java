package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import taks.configEnviromentTask;


public class configEnviroment  {

    @Before
    public void setUp()  {
        configEnviromentTask tst = new configEnviromentTask();
        tst.browser();
    }

    @After
    public void tearDown(){
        configEnviromentTask tst = new configEnviromentTask();
        tst.tear();
    }

    @Given("Ingresar la url del ambiente {}, {}")
    public void Environment_Intelica(String ambiente, String estable) {
        configEnviromentTask test = new configEnviromentTask();
        test.Estabilidad(ambiente, estable);
    }



}
