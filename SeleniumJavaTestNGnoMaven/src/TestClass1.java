
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TestClass1 {
	
	Login ln = new Login();

@BeforeSuite
public void  BeforeSuite()
{
	System.out.println("TestClass1: ***Before Suite Started***");
}
@BeforeTest      // This will execute before executing any @Test
public void BeforeTest()
{
	System.out.println("TestClass1: ***Before Test Started***");
}

@BeforeClass(alwaysRun = true)   //It applies to all the @Test in this testNG (TestClass1) class
public void BeforeClass()
{
	System.out.println("TestClass1: ***Before Class Started*** opened the browser");
	//ln.InvokeApp();
}

@BeforeMethod   //It applies to all the @Test in this testNG (TestClass1) class
public void BeforeMethod()
{
	System.out.println("TestClass1: ***Before Method Started*** opened the browser");
	//ln.InvokeApp();
}

@DataProvider(name="Data")
public Object[][] getData(){
	Object[][] obj = new Object[2][2];
	obj[0][0] = "mercury";
	obj[0][1] = "mercury";
	obj[1][0] = "mercury";
	obj[1][1] = "mercury";
	return obj;
}


@Test (groups = {"p1"},dataProvider = "Data")
public void Test1(String uName, String pWd) {	
//public void Test1() {	
	
	System.out.println("TestClass1: ***Test1 Started***");
    ln.InvokeApp();
	
	/*ln.EnterUsername(uName);
	ln.EnterPwd(pWd);
	ln.ClickSignin();
	ln.LogoffApp();*/
	
	/*ln.EnterUsername("mercury");
	ln.EnterPwd("mercury");
	ln.ClickSignin();
	ln.LogoffApp();*/
	
}

@Test(groups = {"p2"})
public void Test2()
{
	System.out.println("TestClass1: ***Test2 Started***");
	
}

@Test(groups = {"p2"})
public void Test3()
{
	System.out.println("TestClass1: ***Test3 Started***");
	
}

@AfterMethod
public void AfterMethod()
{
	System.out.println("TestClass1: ***After Method Started*** Closed the browser");
	//ln.closeBrowser();
}

@AfterClass(alwaysRun = true)
public void AfterClass()
{
	System.out.println("TestClass1: ***After Class Started*** Closed the browser");
	ln.closeBrowser();
}
	
@AfterTest
public void AfterTest()
{
	System.out.println("TestClass1: ***After Test Started*** Closed the browser");
	//ln.closeBrowser();
}
	
}//END OF TestNG
