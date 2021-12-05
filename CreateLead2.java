package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateLead2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window ().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vijayakumar");
		WebElement ele1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(ele1);
		select.selectByVisibleText("Partner");
		WebElement ele2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select select1 = new Select(ele2);
		select1.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ani2");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Vijay2");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/14/90");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Department");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5 Laks per Annum");
		WebElement ele8 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select select8 =new Select(ele8);
		select8.selectByVisibleText("INR - Indian Rupee");
		WebElement ele3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select select3 =new Select(ele3);
		select3.selectByVisibleText("Media");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		WebElement ele4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select select4 = new Select(ele4);
		select4.selectByVisibleText("Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("980");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Pending");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Automation");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("In Selenium");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9952042929");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("8977");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mentor");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test123@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://testurlcom");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anitha Vijayakumar");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Asha");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:1, HL colony");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Pammal");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement ele5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select select5 = new Select(ele5);
		select5.selectByVisibleText("Australia");
		WebElement ele6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select6 =new Select(ele6);
		select6.selectByVisibleText("Victoria");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("001");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("97601");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();
	}

}
