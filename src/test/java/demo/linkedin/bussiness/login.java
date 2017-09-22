package demo.linkedin.bussiness;

import org.openqa.selenium.WebDriver;

import demo.linkedin.page.login_;

public class login extends login_{

	public login(WebDriver driver){
		super(driver);
	}
	public void formFillUp(String fname,String lname,String Phoneno,String Pwd){
		getFName().clear();
		getFName().sendKeys(fname);
		getLName().clear();
		getFName().sendKeys(lname);
		getPhone().clear();
		getFName().sendKeys(Phoneno);
		getPass().clear();
		getFName().sendKeys(Pwd);
	}
}
