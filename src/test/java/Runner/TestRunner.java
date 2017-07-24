package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by chhormchhatra from KEEN Virtual Company of KIT on 7/19/17.
 */

    @CucumberOptions(features = {"src/test/java/Features"}, format ={"json:target/androidTestReport.json", "html:target/androidTestReport-keen-report-html"} , glue = "Steps")
    public class TestRunner extends AbstractTestNGCucumberTests {

    }
/*
* Be Careful that the setting in @CucumberOptions and the setting in
* maven-cucumber-plugin configuration is the same
* the critical file is the json file
* make sure that the json file has the same name and locates at the same place
* */

