package Steps;

import Base.BaseUtil;
import POM.pomEg;
import cucumber.api.java8.En;

/**
 * Created by chhormchhatra on 7/19/17.
 */

public class StepDefiniEg implements En {

    private BaseUtil base;
    public StepDefiniEg(BaseUtil base) {
        this.base = base;
    }
    

    public StepDefiniEg() {
        /*
         * TODO
         * Make an object for each class in POM, to access the action and element in classes located at POM package
         * Then, pass the base.driver to the constructor
         * e.g. pomEg obj = new pomEg(base.driver);
         * */
        pomEg obj = new pomEg(base.driver);
        Given("^I get to do pre-requests here$", () -> {
            /*
            * Example to access methods in POM
            *   obj.actionButton();
            *   NB: actionButton()is defined in pomEg class in POM package
            * */
            obj.actionButton();
            System.out.println("Pre-request actions to perform");
        });
        And("^I get to do some more pre-requests here$", () -> {
            System.out.println("More Pre-request actions to perform");
        });
        When("^I perform some action here$", () -> {
            System.out.println("Perform action here");
        });
        Then("^I get a result here$", () -> {
            System.out.println("Expected Result");
        });
    }
}
