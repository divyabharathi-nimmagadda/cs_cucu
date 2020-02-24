package cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
	WebDriver driver;
@Given("user enter inti registration page")
public void user_enter_inti_registration_page() {
	System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
	driver.findElement(By.id("details-button")).click();
	driver.findElement(By.id("proceed-link")).click();
	driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();

}

@When("user enters {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_enters(String un, String fn, String ln, String pwd, String cnfpwd, String email, String pn, String dob) {
driver.findElement(By.name("userName")).sendKeys(un);
driver.findElement(By.name("firstName")).sendKeys(fn);
driver.findElement(By.name("lastName")).sendKeys(ln);
driver.findElement(By.name("password")).sendKeys(pwd);
driver.findElement(By.name("confirmPassword")).sendKeys(cnfpwd);
driver.findElement(By.xpath("//input[@value='Female']")).click();
driver.findElement(By.name("emailAddress")).sendKeys(email);
driver.findElement(By.name("mobileNumber")).sendKeys(pn);
driver.findElement(By.name("dob")).sendKeys(dob);
driver.findElement(By.name("address")).sendKeys("chennai");
Select s=new Select(driver.findElement(By.name("securityQuestion")));
s.selectByIndex(2);
driver.findElement(By.name("answer")).sendKeys("Tommy");
driver.findElement(By.name("Submit")).click();
}

@Then("user navigates to login page")
public void user_navigates_to_login_page() {
  
  }



}
