package cucumber3;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add {

	WebDriver driver;
@Given("login page successfull")
public void login_page_successfull() {
   System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
   driver.findElement(By.id("details-button")).click();
   driver.findElement(By.id("proceed-link")).click();
   driver.findElement(By.xpath("//a[@href='#']")).click();
   driver.findElement(By.xpath("//a[@href='login.htm']")).click();
   driver.findElement(By.name("userName")).sendKeys("Lalitha");
   driver.findElement(By.name("password")).sendKeys("password123");
   driver.findElement(By.name("Login")).click();
}

@When("search products to add")
public void search_products_to_add() {
	
	driver.findElement(By.xpath("//a[@href=\'#\']")).click();
	driver.findElement(By.linkText("All Categories"));
	driver.findElement(By.linkText("Electronics")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Head Phone")).click();
	driver.findElement(By.linkText("Add to cart")).click();
	driver.findElement(By.xpath("//a[@href=\'displayCart.htm\']")).click();
	driver.findElement(By.xpath("//a[@href=\'checkout.htm\']")).click();
	driver.findElement(By.id("choice-dollar")).click();
	driver.findElement(By.id("add2")).sendKeys("Andhra pradesh-57623");
	driver.findElement(By.xpath("//input[@value=\'Proceed to Pay\']")).click();
}

@Then("processing to pay")
public void processing_to_pay() {
  
}



}
