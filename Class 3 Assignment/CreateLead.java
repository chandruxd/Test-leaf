package week2.day1.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
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
		//5. Click on Leads Button
		driver.findElementByLinkText("Leads").click();
		//6. Click on create Lead Button
		driver.findElementByLinkText("Create Lead").click();
		//7. Enter CompanyName using id Locator
		driver.findElementById("createLeadForm_companyName").sendKeys("amazon");
		//8. Enter FirstName using id Locator
		driver.findElementById("createLeadForm_firstName").sendKeys("Sam");
		//9. Enter LastName using id Locator
		driver.findElementById("createLeadForm_lastName").sendKeys("Curran");
		//10. Select value as Employee in Source Using SelectbyVisible text
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Employee");
		//11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown1 = new Select(MarketingCampaign);
		dropdown1.selectByValue("9001");
		//13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement Ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown2 = new Select(Ownership);
		dropdown2.selectByIndex(5);
		//14. Select value as India in Country Field Using SelectbyVisibletext
		WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown3 = new Select(Country);
		dropdown3.selectByVisibleText("India");
		//15. Click on create Lead Button Using name Locator
		driver.findElementByClassName("smallSubmit").click();
		//16. Get the Title of the resulting Page
		System.out.println("The Title of the Resulting page is " +driver.getTitle());
		
		Thread.sleep(3000);
		driver.close();
	}

}
