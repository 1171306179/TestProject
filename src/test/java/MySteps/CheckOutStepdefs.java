package MySteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CheckOutStepdefs extends AbstractStepDefs{

    @Given("user open Shopping Card And click CHECKOUT")
    public void userClickCHECKOUT() throws InterruptedException {
        //Open shopping cart
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(1000);
        //Click check out
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
    }

    @When("user enter FirstName as {string} and LastName as {string} and Zip\\/PostalCode as {string}")
    public void userEnter(String arg0, String arg1, String arg2) throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys(arg0);
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(arg1);
        driver.findElement(By.id("postal-code")).sendKeys(arg2);
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
    }

    @Then("Whether the payment was successful")
    public void ThePaymentSuccessful() throws InterruptedException {
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/checkout-step-two.html")){
            System.out.println("Test Pass");
            Thread.sleep(1000);
            //Click finish button
            driver.findElement(By.id("finish")).click();
        }
        else {
            System.out.println("Test Failed");
        }

        Thread.sleep(2000);
    }


}
