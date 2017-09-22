package demo.linkedin.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import demo.linkedin.Base;
import demo.linkedin.bussiness.login;

public class MyTest {
	
	@Test
	public void test01(){
		Base b = new Base();
		WebDriver driver = b.getDriver();
		PageFactory.initElements(driver, login.class);
		String url="https://in.linkedin.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}

}
