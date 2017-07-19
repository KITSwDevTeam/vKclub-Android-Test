package Steps;

import Base.BaseUtil;
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
        Given("^I get to do pre-requests here$", () -> {
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
