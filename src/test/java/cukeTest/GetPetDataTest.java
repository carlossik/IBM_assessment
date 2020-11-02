package cukeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue= {"com.api.project"})

public class GetPetDataTest {
    //
}






