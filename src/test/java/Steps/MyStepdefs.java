package Steps;

import Base.BaseUtil;
import POM.pomEg;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * Created by chhormchhatra from KEEN Virtual Company of KIT on 7/19/17.
 */
public class MyStepdefs {
    private BaseUtil base;
    public MyStepdefs(BaseUtil base) {
        this.base = base;
    }
    /*
        * TODO
        * Make an object for each annotation in POM, to access the action and element in classes located at POM package
        * (Alternatively, you can make member in classes in POM static and access those member in a static way)
        * Then, pass the base.driver to the constructor
        * e.g. pomEg obj = new pomEg(base.driver);
        * */
    @Given("^I get to do pre-requests here$")
    public void iGetToDoPreRequestsHere() throws Throwable {
            /*
            * Example to access methods in POM
            *   obj.actionButton();
            *   NB: actionButton()is defined in pomEg class in POM package
            * */
        pomEg obj = new pomEg(base.driver);
        obj.actionButton();
        System.out.println("Pre-request actions to perform");
    }

    @And("^I get to do some more pre-requests here$")
    public void iGetToDoSomeMorePreRequestsHere() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I perform some action here$")
    public void iPerformSomeActionHere() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I get a result here$")
    public void iGetAResultHere() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}