package Pop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	@FindBy(linkText="Register Now!") public WebElement Register;
	
	
	
	public RegistrationPage(WebElement driver) {
		
		PageFactory.initElements(driver, this);
	}
		
		public void Registration_Page() {
			
			Register.click();
			
		}
	}





