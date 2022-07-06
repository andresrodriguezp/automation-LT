import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class automation_LT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/ANDRES/Documents/automation/automationdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		String NameofItem = driver.findElement(By.linkText("Sauce Labs Onesie")).getText();
		driver.findElement(By.className("shopping_cart_link")).click();
		Assert.assertEquals(driver.findElement(By.linkText("Sauce Labs Onesie")).getText(), NameofItem);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Lin");
		driver.findElement(By.id("last-name")).sendKeys("Tech");
		driver.findElement(By.id("postal-code")).sendKeys("680011");
		driver.findElement(By.id("continue")).click();
		Assert.assertEquals(driver.findElement(By.linkText("Sauce Labs Onesie")).getText(), NameofItem);
		driver.findElement(By.id("finish")).click();
		Assert.assertEquals(driver.findElement(By.className("title")).getText(), "CHECKOUT: COMPLETE!");
		driver.quit();
		

	}

}
