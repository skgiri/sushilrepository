import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (			
		features = {"./src/Feature Folder/Login.feature"},	
		format = {"pretty", "html:target/cucumber"},
		glue = {},
		//tags={"@p1","@smoke"}
		//tags={"@p1","@functional"}
		//tags={"@outline"}
		tags={"@login"}
		)
public class Test_Runner {
	
}
