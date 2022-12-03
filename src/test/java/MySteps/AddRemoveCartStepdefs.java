package MySteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AddRemoveCartStepdefs extends AbstractStepDefs{
    @Given("user starts shopping for the product")
    public void goToShopping() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        Thread.sleep(1000);
    }

    @When("user click ADD TO CARD")
    public void userClickADD() {
        //add first and second items to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    }

    @Then("AddCart should be successful")
    public void addcartShouldBeSuccessful() throws InterruptedException {
        //Check if button become REMOVE, add successfully
        if (driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed() && driver.findElement(By.id("remove-sauce-labs-bike-light")).isDisplayed()) {
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Failed");
        }
        Thread.sleep(2000);
    }

    @When("user click REMOVE")
    public void userClickREMOVE() {
        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
    }

    @Then("AddCart successful again and open shopping cart")
    public void addcartSuccessfulAgainAndOpenShoppingCart() throws InterruptedException {
        //Check if button become ADD TO CART, remove successfully
        if(driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).isDisplayed()){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Failed");
        }

        //Open shopping cart
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(2000);
    }
}
