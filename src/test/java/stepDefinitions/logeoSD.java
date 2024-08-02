package stepDefinitions;

import io.cucumber.java.en.And;
import taks.logeoTask;

public class logeoSD {

    @And("Seleccionamos Generate Token")
    public void Logeo() throws InterruptedException {
        logeoTask test = new logeoTask();
        test.logeoTest();
    }
}
