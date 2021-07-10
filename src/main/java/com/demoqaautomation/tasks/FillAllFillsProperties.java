package com.demoqaautomation.tasks;

import com.demoqaautomation.ui.RegisterFormPage;
import com.demoqaautomation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillAllFillsProperties implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();
        actor.attemptsTo(
                Enter.keyValues(SpecialMethods.properties.getProperty("firstName")).into(RegisterFormPage.INPUT_FIRSTNAME),
                Enter.keyValues(SpecialMethods.properties.getProperty("lastName")).into(RegisterFormPage.INPUT_LASTNAME),
                Enter.keyValues(SpecialMethods.properties.getProperty("email")).into(RegisterFormPage.INPUT_EMAIL_USER),
                JavaScriptClick.on(RegisterFormPage.GENDER_RADIO),
                Enter.theValue(SpecialMethods.properties.getProperty("mobileNumber")).into(RegisterFormPage.INPUT_NUMBER),
                JavaScriptClick.on(RegisterFormPage.INPUT_DATE_OF_BIRTH),
                WaitUntil.the(RegisterFormPage.MONTH_SELECT, isVisible()),
                JavaScriptClick.on(RegisterFormPage.MONTH_SELECT),
                JavaScriptClick.on(RegisterFormPage.OPTION_MONTH),
                WaitUntil.the(RegisterFormPage.YEAR_SELECT, isVisible()),
                JavaScriptClick.on(RegisterFormPage.YEAR_SELECT),
                JavaScriptClick.on(RegisterFormPage.YEAR_SELECT),
                JavaScriptClick.on(RegisterFormPage.OPTION_DAY),

                WaitUntil.the(RegisterFormPage.INPUT_SUBJECTS, isVisible()).forNoMoreThan(10).seconds(),
                Enter.keyValues(SpecialMethods.properties.getProperty("subject")).into(RegisterFormPage.INPUT_SUBJECTS),
                Enter.keyValues(Keys.ENTER).into(RegisterFormPage.INPUT_SUBJECTS),
                Scroll.to(RegisterFormPage.SELECT_UPLOAD),
                JavaScriptClick.on(RegisterFormPage.CHECKBOX_HOBBIES),
                Enter.keyValues(SpecialMethods.properties.getProperty("picture")).into(RegisterFormPage.SELECT_UPLOAD),
                Enter.theValue(SpecialMethods.properties.getProperty("currentAddress")).into(RegisterFormPage.ADDRESS_CURRENT_INPUT),
                JavaScriptClick.on(RegisterFormPage.INPUT_STATE),
                Enter.theValue(SpecialMethods.properties.getProperty("state")).into(RegisterFormPage.INPUT_STATE),
                Enter.keyValues(Keys.ENTER).into(RegisterFormPage.INPUT_STATE),
                JavaScriptClick.on(RegisterFormPage.CITY_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("city")).into(RegisterFormPage.CITY_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterFormPage.CITY_INPUT),
                JavaScriptClick.on(RegisterFormPage.SUBMIT_BUTTON)


        );
    }

    public static FillAllFillsProperties dataInjectionProperties(){
        return instrumented(FillAllFillsProperties.class);
    }
}
