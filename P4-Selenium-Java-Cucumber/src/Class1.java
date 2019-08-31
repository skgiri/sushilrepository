import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;



public class Class1 {

	public static void main(String[] args)  
	{//Start of main
		Class1 obj1 = new Class1();	
		Login login;
		
/*		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new ChromeDriver();		
		driver.get("http://newtours.demoaut.com");
		System.out.println("Maximized");	
		driver.close();
		driver.quit();*/
		
		//jsonreader("TC1");
		obj1.jsonreader("TC1");
		//obj1.jsonreader("TC2");
	
		
		
	}//End of main
	
	 public void jsonreader(String TestcaseId)
	{
		JsonParser parser = new JsonParser();
		try {
			Object obj = parser.parse(new FileReader("D:\\Selenium\\workspace\\Project4\\src\\Data Sheet\\P4.json"));
			JsonObject jsonobject = (JsonObject) obj;
			System.out.println(jsonobject.get(TestcaseId));	
			JsonArray myarray = (JsonArray)jsonobject.getAsJsonArray((TestcaseId));	
			System.out.println(myarray.get(0));
			JsonObject objarry = myarray.get(0).getAsJsonObject();
			System.out.println(objarry.get("name1"));
		
			//return objarry;

			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			System.out.println("Uhhh..There is a SYNTAX error in json file.");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("json file NOT found, please verify file path");
			e.printStackTrace();
		}
		//return objarry;
		
		
	}


	

	

	
	
}//End of class







