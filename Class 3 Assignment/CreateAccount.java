package week2.day1.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//2. Enter UserName and Password Using Id Locator
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		//3. Click on Login Button using Class Locator
		driver.findElementByClassName("decorativeSubmit").click();
		//4. Click on CRM/SFA Link
		driver.findElementByPartialLinkText("CRM").click();
		//5. Click on Accounts Button
		driver.findElementByLinkText("Accounts").click();
		//6. Click on Create Account
		driver.findElementByLinkText("Create Account").click();
		//7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElementByXPath("//input[@class='inputBox']").sendKeys("Debit Limited Account");
		//8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		//9. Enter LocalName Field Using Xpath Locator
		driver.findElementByXPath("//input[@maxlength='100' and @name='groupNameLocal']").sendKeys("John");
		//10. Enter SiteName Field Using Xpath Locator
		driver.findElementByXPath("//input[@name='officeSiteName']").sendKeys("Constructions");
		//11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("400000");
		//12. Select Industry as ComputerSoftware
		WebElement Industry = driver.findElementByName("industryEnumId");		
		Select dropDown = new Select(Industry);
		dropDown.selectByIndex(3);
		//13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement Ownership = driver.findElementByName("ownershipEnumId");
		Select dropDown1 = new Select(Ownership);
		dropDown1.selectByVisibleText("S-Corporation");
		//14. Select Source as Employee using SelectByValue
		WebElement Source = driver.findElementById("dataSourceId");
		Select dropDown2 = new Select(Source);
		dropDown2.selectByValue("LEAD_EMPLOYEE");
		//15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement MarketingCampaign = driver.findElementById("marketingCampaignId");		
		Select dropDown3 = new Select(MarketingCampaign);
		dropDown3.selectByIndex(6);
		//16. Select State/Province as Texas using SelectByValue
		WebElement State = driver.findElementById("generalStateProvinceGeoId");
		Select dropDown4 = new Select(State);
		dropDown4.selectByValue("TX");
		//17. Click on Create Account using Xpath Locator
		driver.findElementByXPath("//input[@onclick='submitFormWithSingleClick(this)']").click();
	}

}
