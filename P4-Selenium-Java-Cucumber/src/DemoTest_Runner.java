import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		format = {},
		features = {"src/Feature Folder/Demo.feature"},
		glue = {}
		//tags={"@demo"}
		  //tags={"@p1","@functional"}
		)
public class DemoTest_Runner {
	
}
