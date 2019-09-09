package shop;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resource"},//path of my feature files
        format = {"pretty" ,"json:target/cucumber.json"},// To generate report 
       // strict = false,//check if the steps are in my step definition file
        monochrome = true,  //display the console in a proper readable format
      // tags = {"@CheckOuts"},
        glue = {"shopStepDefinition"}
		        
		//C:\eclipse\Illumination\ShopDemo\src\test\resource
		//src/test/resource
		          )


public class TestRunner {

}
