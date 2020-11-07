package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberReport {

	WebDriver driver = null;

	@Given("I have to open the browser")
	public void openBrowser() {
		driver = new FirefoxDriver();
	}

	@When("I have to open my website")
	public void goToHCM() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@Then("Login button should exist")
	public void loginButton() {
		if (driver.findElement(By.xpath("//input[@id='btnLogin']")).isDisplayed()) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

	}

	@Then("Close Browser")
	public void TerminateBrowser() {
		driver.close();
	}

}
