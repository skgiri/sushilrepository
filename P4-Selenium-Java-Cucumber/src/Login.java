import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {    //Start of Login class
	
	WebDriver driver;

	public Login() {
		// TODO Auto-generated constructor stub
		//this.driver = driver;
		driver = new FirefoxDriver();
		
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
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
		
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
				driver.close();
				driver.quit();
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
