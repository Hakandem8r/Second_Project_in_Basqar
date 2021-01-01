package StepDefinitions;

import Pages.DialogContent;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class Notation_Keys {

    WebDriver driver;

    DialogContent dialogContent=new DialogContent();

    @Given("^Navigate to Basqar$")
    public void navigateToBasqar() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
    }

    @When("^Enter username and password and Click Login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dialogContent.findElementAndSendKeysFunction("username","daulet2030@gmail.com");
        dialogContent.findElementAndSendKeysFunction("password","TechnoStudy123@");
        dialogContent.findElementAndClickFunction("loginBtn");
        dialogContent.findElementAndClickFunction("gotItBtn");
    }

    @Then("^User should login succesfully$")
    public void userShouldLoginSuccesfully() {
    }

    @When("^click Human Resources button$")
    public void clickHumanResourcesButton() {
        dialogContent.findElementAndClickFunction("humanResBtn");
    }

    @Then("^click the Setup button$")
    public void clickTheSetupButton() {
        dialogContent.findElementAndClickFunction("setupBtn");
    }

    @And("^click the Notation Keys$")
    public void clickTheNotationKeys() {
        dialogContent.findElementAndClickFunction("notationKeysBtn");
    }

    @When("^Click the Add button$")
    public void clickTheAddButton() throws InterruptedException {
        Thread.sleep(3000);
        dialogContent.findElementAndClickFunction("addBtn");
    }

    @Then("^Write the NameA$")
    public void writeTheNameA() {
        dialogContent.findElementAndSendKeysFunction("nameInput","saff");
    }

    @And("^Click the Short Name line$")
    public void clickTheShortNameLine() {
        dialogContent.findElementAndClickFunction("shortNameInput");
    }

    @Then("^Write the Short Name$")
    public void writeTheShortName() {
        dialogContent.findElementAndSendKeysFunction("shortNameInput","sa");
    }

    @Then("^Click the Multiplier line$")
    public void clickTheMultiplierLine() {
        dialogContent.findElementAndClickFunction("multiplierInput");
    }

    @And("^Write the Multiplier number$")
    public void writeTheMultiplierNumber() {
        dialogContent.findElementAndSendKeysFunction("multiplierInput","1");
    }

    @Then("^Click the applyFirst button$")
    public void clickTheApplyFirstButton() {
        dialogContent.findElementAndClickFunction("applyFirstBtn");
    }

    @When("^Click the editNameLine$")
    public void clickTheEditNameLine() {
        dialogContent.findElementAndClickFunction("editNameLineClick");
    }

    @And("^Write the NameB$")
    public void writeTheNameB() {
        dialogContent.findElementAndSendKeysFunction("repeatTheName","saff");
    }

    @And("^Click the Search button$")
    public void clickTheSearchButton() {
        dialogContent.findElementAndClickFunction("searchBtn");

    }

    @Then("^Click the Edit button$")
    public void clickTheEditButton() {
        dialogContent.findElementAndClickFunction("editBtn");
    }

    @Then("^Write the newName$")
    public void writeTheNewName() {
        dialogContent.findElementAndSendKeysFunction("newName","taff");
    }

    @Then("^Click the applyEdit button$")
    public void clickTheApplyEditButton() {
        dialogContent.findElementAndClickFunction("applyEditBtn");
    }

    @When("^Click the Delete button$")
    public void clickTheDeleteButton() {
        dialogContent.findElementAndClickFunction("deleteBtn");
    }

    @And("^Click the Yes button$")
    public void clickTheYesButton() {
        dialogContent.findElementAndClickFunction("yesBtn");
    }
}
