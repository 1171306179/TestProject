package MySteps;

import io.cucumber.java.en.Given;

/**
 * Initialization
 */
public class StepDefinitions extends AbstractStepDefs {

    //Open login website
    @Given("the Login page is opened")
    public void theLoginPageIsOpened() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");

    }

    //open items website
    @Given("the home page is opened")
    public void theHomePageIsOpened() throws InterruptedException {
        driver.get("https://www.saucedemo.com/inventory.html");

    }

    //open cart website
    @Given("the Cart page is opened")
    public void theCartPageIsOpened() {
        driver.get("https://www.saucedemo.com/cart.html");
    }





}