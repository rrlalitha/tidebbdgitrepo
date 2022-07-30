package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Home {

	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1088031\\Downloads\\tidebbd\\tidebbd\\src\\test\\resources\\drivers\\chromedriver.exe");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		

	}

	@And("user is on tide home page")
	public void user_is_on_tide_home_page() {
		driver= new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		WebElement ele = driver.findElement(By.xpath("//input[@type='search']"));
		ele.sendKeys("powder");
		
	}

	@And("hit enter")
	public void hit_enter() throws InterruptedException {
		WebElement ele1=driver.findElement(By.xpath("//button[@type='submit']"));
		ele1.click();
		Thread.sleep(3000);
		driver.close();
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
		
	}


}
