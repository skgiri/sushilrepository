
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {    //Start of Login class	
	WebDriver driver ;
	public Login() {  // TODO Auto-generated constructor stub		
		//this.driver = driver;		
		driver = new FirefoxDriver();	
		System.out.println("firefox driver");
	}//End of constructor
	
	//*** By References starts from here ***
	By userName = By.name("userName");
	By password = By.name("password");
	By login = By.name("login");
	By signoff = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a");
	//*** By References End from here ***

	//Methods start from here
	
	public void InvokeApp()
	{		
		//driver.get("http://newtours.demoaut.com/");		
		driver.get("http://moneycontrol.com");	
		driver.manage().window().maximize();
		//WebElement myele = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id("myele")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement ele2 = (WebElement) new Actions(driver).dragAndDrop(source, target);
	}
	//Alert alert = driver.switchTo().alert();		
	public void EnterUsername(String uName)
	{
	
		try{
			
			if(driver.findElement(userName).isDisplayed())
			{
				driver.findElement(userName).sendKeys(uName);
			}
			else
			{
				System.out.println("Username is NOT Entered");
				
			}
				
				
		}
		catch (Exception e){ 
			
		}

	}
	
	public void EnterPwd(String pWd)
	{
	
		try{
			
			if(driver.findElement(password).isDisplayed())
			{
				driver.findElement(password).sendKeys(pWd);
			}
			else
			{
				System.out.println("Password is NOT Entered");
				
			}
				
				
		}
		catch (Exception e){ 
			
		}

	}
	
	public void ClickSignin()
	{
	
		try{
			
			if(driver.findElement(login).isDisplayed())
			{
				driver.findElement(login).click();;
			}
			else
			{
				System.out.println("Sign in button is NOT clicked");
				
			}
				
				
		}
		catch (Exception e){ 
			
		}

	}
	
	public void LogoffApp()
	{
	
		try{
			
			if(driver.findElement(signoff).isDisplayed())
			{
				driver.findElement(signoff).click();
				//driver.close();// This will close the browser
				//driver.quit();//This will close the session(it calls disposse() method)
			}
			else
			{
				System.out.println("Sign off link is NOT clicked");
				
			}
				
				
		}
		catch (Exception e){ 
			
		}

	}
	
	public void closeBrowser()
	{
	
		try{
			
			if(true)
			{
				//driver.findElement(signoff).click();
				driver.close();// This will close the browser
				driver.quit();//This will close the session(it calls disposse() method)
			}
			else
			{
				System.out.println("Sign off link is NOT clicked");
				
			}
				
				
		}
		catch (Exception e){ 
			
		}

	}
	//Methods End from here

}//End of Login class
