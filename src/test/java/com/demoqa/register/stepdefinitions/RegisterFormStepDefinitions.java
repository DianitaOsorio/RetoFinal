package com.demoqa.register.stepdefinitions;

import com.demoqaautomation.interactions.OpenTheBrowser;
import com.demoqaautomation.tasks.FillAllFillsExcel;
import com.demoqaautomation.tasks.FillAllFillsFaker;
import com.demoqaautomation.tasks.FillAllFillsProperties;
import com.demoqaautomation.tasks.Validations;
import com.demoqaautomation.ui.RegisterFormPage;
import com.demoqaautomation.utils.SpecialMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterFormStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diana").can(BrowseTheWeb.with(driver));
    }

    @Given("^we are on the page$")
    public void weAreOnThePage() {
        theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(RegisterFormPage.URL));
        SpecialMethods.takeScreenShotShortPage(driver);
    }

    //Scenario excel with data injection

    @When("^fill all the requested data$")
    public void fillAllTheRequestedData() {
       theActorInTheSpotlight().attemptsTo(FillAllFillsExcel.dataInjection());
        SpecialMethods.takeScreenShotShortPage(driver);

    }

    @Then("^i can see my data down the form a message in excel$")
    public void iCanSeeMyDataDownTheFormAMessageInExcel() {
       theActorInTheSpotlight().attemptsTo(Validations.compareText());

    }

//Scenario properties with data injection

    @When("^fill all the requested data in properties$")
    public void fillAllTheRequestedDataInProperties() {
    theActorInTheSpotlight().attemptsTo(FillAllFillsProperties.dataInjectionProperties());
        SpecialMethods.takeScreenShotShortPage(driver);
    }

    @Then("^i can see my data down the form in properties$")
    public void iCanSeeMyDataDownTheFormInProperties() {
        SpecialMethods.takeScreenShotShortPage(driver);
        theActorInTheSpotlight().attemptsTo(Validations.compareText());

    }
        //Scenario faker with data injection


        @When("^fill all the requested data in faker$")
        public void fillAllTheRequestedDataInFaker() {
            theActorInTheSpotlight().attemptsTo(FillAllFillsFaker.dataInjectionFaker());
            SpecialMethods.takeScreenShotShortPage(driver);
        }

        @Then("^i can see my data in down the form in faker$")
        public void iCanSeeMyDataInDownTheFormInFaker() {

        }


    }
