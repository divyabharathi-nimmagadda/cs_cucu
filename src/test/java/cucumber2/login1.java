package cucumber2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login1 {
WebDriver driver;
@Given("display the login page")
public void display_the_login_page() {
  System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
  driver.findElement(By.id("details-button")).click();
 driver.findElement(By.id("proceed-link")).click();
	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
}

@When("user enters {string},{string}")
public void user_enters(String un, String pwd) {
	driver.findElement(By.name("userName")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pwd);
  driver.findElement(By.name("Login")).click();
}

@Then("user navigate main page")
public void user_navigate_main_page() {
   
}


}
