package Seleniun.first;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */

	/**
	 * Rigourous Test :-)
	 */
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void signup() {
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().setSize(new Dimension(1366, 738));
		{
			WebElement element = driver.findElement(By.linkText("ES"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element).perform();
		}
		driver.findElement(By.cssSelector(".contact-ohrm")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".contact-ohrm"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element).perform();
		}
		driver.findElement(By.id("firstname-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("firstname-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("firstname-40929fcd-ed29-4e47-af56-dc8899a6898a")).sendKeys("ajithmoorthy");
		driver.findElement(By.id("lastname-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("lastname-40929fcd-ed29-4e47-af56-dc8899a6898a")).sendKeys("periyasamy");
		driver.findElement(By.id("company-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("company-40929fcd-ed29-4e47-af56-dc8899a6898a")).sendKeys("atmecs");
		driver.findElement(By.id("numemployees-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		{
			WebElement dropdown = driver.findElement(By.id("numemployees-40929fcd-ed29-4e47-af56-dc8899a6898a"));
			dropdown.findElement(By.xpath("//option[. = '201 - 250']")).click();
		}
		driver.findElement(By.id("numemployees-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("phone-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("phone-40929fcd-ed29-4e47-af56-dc8899a6898a")).sendKeys("653246575132");
		driver.findElement(By.id("jobtitle-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("jobtitle-40929fcd-ed29-4e47-af56-dc8899a6898a")).sendKeys("trainee");
		driver.findElement(By.id("email-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("email-40929fcd-ed29-4e47-af56-dc8899a6898a")).sendKeys("ajith.periyasamy@atmecs.com");
		driver.findElement(By.id("email-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("email-40929fcd-ed29-4e47-af56-dc8899a6898a")).sendKeys("ajith.periyasamy@gmail.com");
		driver.findElement(By.id("country-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		{
			WebElement dropdown = driver.findElement(By.id("country-40929fcd-ed29-4e47-af56-dc8899a6898a"));
			dropdown.findElement(By.xpath("//option[. = 'India']")).click();
		}
		driver.findElement(By.id("country-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("message-40929fcd-ed29-4e47-af56-dc8899a6898a")).click();
		driver.findElement(By.id("message-40929fcd-ed29-4e47-af56-dc8899a6898a")).sendKeys("hai i  am ajith");
		driver.findElement(By.cssSelector(".hs-button")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".hs-button"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Action builder = (Action) new Actions(driver);
			((Actions) builder).moveToElement(element, 0, 0).perform();
		}
		driver.switchTo().frame(4);
		driver.findElement(By.id("recaptcha-verify-button")).click();
	}

	@Test
	public void testApp() {
		AssertJUnit.assertTrue(true);
	}
}
