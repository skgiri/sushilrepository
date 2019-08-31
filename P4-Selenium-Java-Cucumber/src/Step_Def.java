import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;


public class Step_Def {
	Login ln;
	public Step_Def()
	{
		ln = new Login();
	}
	
	
	//Step definitions start from here
	@Given("^Login to application$")
	public void login_to_application() throws Throwable {
	    ln.InvokeApp();
		ln.EnterUsername("mercury");
		ln.EnterPwd("mercury");
		ln.ClickSignin();
		ln.LogoffApp();
		System.out.println("Login Application  Successful!!");
	}
	
	@Given("^Login to application using \"(.*?)\" and \"(.*?)\"$")
	public void login_to_application_using_and(String arg1, String arg2) throws Throwable {
	    ln.InvokeApp();
		ln.EnterUsername(arg1);
		ln.EnterPwd(arg2);
		ln.ClickSignin();
		ln.LogoffApp();
		System.out.println("Login Application using feature steps variables Successful!!");
		}
	
	@Given("^Example of docstring$")
	public void example_of_docstring(String arg1) throws Throwable {
	    System.out.println("Example of docstring : "+arg1);
	}
	
	@Given("^Example of data table$")
	public void example_of_data_table(List<String> arg1) throws Throwable {		
		for(int i=0;i < arg1.size();i++)
		{
			System.out.println(arg1.get(i));
		}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}
	
	}//End of step definition


