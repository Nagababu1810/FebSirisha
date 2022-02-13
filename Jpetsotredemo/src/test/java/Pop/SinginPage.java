package Pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SinginPage {

	@FindBy(linkText="Sign In") public WebElement singin;
	@FindBy(id="stripes-522180846") public WebElement email;
	@FindBy(name="password") public WebElement pwd;
	@FindBy(name="signon")  public WebElement login;
	public WebDriver driver;
	
	public SinginPage()
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	
	
	
	public void Singin_Page() {
		
		singin.click();
		email.sendKeys("nagababu");
		pwd.sendKeys("12345");
		login.click();
		
	}
	
	
}
