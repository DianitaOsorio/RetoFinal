package com.demoqaautomation.tasks;

import com.demoqaautomation.models.DataInjection;
import com.demoqaautomation.ui.RegisterFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillAllFillsFaker implements Task {
    private DataInjection dataInjection = new DataInjection();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(dataInjection.getName()).into(RegisterFormPage.INPUT_FIRSTNAME),
                Enter.keyValues(dataInjection.getLastName()).into(RegisterFormPage.INPUT_LASTNAME),
                Enter.keyValues(dataInjection.getEmail()).into(RegisterFormPage.INPUT_EMAIL_USER),
                JavaScriptClick.on(RegisterFormPage.GENDER_RADIO),
                Enter.keyValues(dataInjection.getNumberMobile()).into(RegisterFormPage.INPUT_NUMBER),
                JavaScriptClick.on(RegisterFormPage.INPUT_DATE_OF_BIRTH),
                WaitUntil.the(RegisterFormPage.MONTH_SELECT, isVisible()),
                JavaScriptClick.on(RegisterFormPage.MONTH_SELECT),
                JavaScriptClick.on(RegisterFormPage.OPTION_MONTH),
                JavaScriptClick.on(RegisterFormPage.YEAR_SELECT),
                JavaScriptClick.on(RegisterFormPage.OPTION_YEAR),
                JavaScriptClick.on(RegisterFormPage.OPTION_DAY) ,
                Enter.keyValues(dataInjection.getSubject()).into(RegisterFormPage.INPUT_SUBJECTS),
                Enter.keyValues(Keys.ENTER).into(RegisterFormPage.INPUT_SUBJECTS),
                Enter.keyValues(dataInjection.getPicture()).into(RegisterFormPage.SELECT_UPLOAD),
                JavaScriptClick.on(RegisterFormPage.CHECKBOX_HOBBIES),
                Enter.keyValues(dataInjection.getCurrentAddress()).into(RegisterFormPage.ADDRESS_CURRENT_INPUT),
                JavaScriptClick.on(RegisterFormPage.INPUT_STATE),
                Enter.keyValues(dataInjection.getState()).into(RegisterFormPage.INPUT_STATE),
                Enter.keyValues(Keys.ENTER).into(RegisterFormPage.INPUT_STATE),
                JavaScriptClick.on(RegisterFormPage.CITY_INPUT),
                Enter.keyValues(dataInjection.getCity()).into(RegisterFormPage.CITY_INPUT),
                Enter.keyValues(Keys.ENTER).into(RegisterFormPage.CITY_INPUT),
                JavaScriptClick.on(RegisterFormPage.SUBMIT_BUTTON)










        );
    }
    public static FillAllFillsFaker dataInjectionFaker(){
        return instrumented(FillAllFillsFaker.class);
    }
}
