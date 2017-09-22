package demo.linkedin.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.linkedin.Base;

public class login_ extends Base{
	public WebDriver driver;
	public login_(WebDriver driver){
		this.driver =driver;
	}
    public By fname =By.xpath(".//*[@id='reg-firstname']");
    public WebElement getFName(){
    	return driver.findElement(fname);
    }
    public By lname =By.xpath(".//*[@id='reg-lastname']");
    public WebElement getLName(){
    	return driver.findElement(lname);
    }
    public By Phoneno =By.xpath(".//*[@id='reg-email']");
    public WebElement getPhone(){
    	return driver.findElement(Phoneno);
    }
    public By Pwd =By.xpath(".//*[@id='reg-password']");
    public WebElement getPass(){
    	return driver.findElement(Pwd);
    }
}