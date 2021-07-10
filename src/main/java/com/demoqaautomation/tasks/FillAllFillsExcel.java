package com.demoqaautomation.tasks;

import com.demoqaautomation.models.DataInjection;
import com.demoqaautomation.ui.RegisterFormPage;
import com.demoqaautomation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillAllFillsExcel implements Task {
    DataInjection dataInjection = new DataInjection();
    @Override
    public <T extends Actor> void performAs(T actor) {
try {
    actor.attemptsTo(
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 0)).into(RegisterFormPage.INPUT_FIRSTNAME),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 1)).into(RegisterFormPage.INPUT_LASTNAME),
            Enter.keyValues(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 2)).into(RegisterFormPage.INPUT_EMAIL_USER),
            JavaScriptClick.on(RegisterFormPage.GENDER_RADIO),
            Enter.keyValues(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 3)).into(RegisterFormPage.INPUT_NUMBER),
            JavaScriptClick.on(RegisterFormPage.INPUT_DATE_OF_BIRTH),
            JavaScriptClick.on(RegisterFormPage.MONTH_SELECT),
            JavaScriptClick.on(RegisterFormPage.OPTION_MONTH),
            WaitUntil.the(RegisterFormPage.YEAR_SELECT, isVisible()),
            JavaScriptClick.on(RegisterFormPage.YEAR_SELECT),
            JavaScriptClick.on(RegisterFormPage.OPTION_YEAR),
            JavaScriptClick.on(RegisterFormPage.OPTION_DAY),
            Enter.keyValues(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 4)).into(RegisterFormPage.INPUT_SUBJECTS),
            Enter.keyValues(Keys.ENTER).into(RegisterFormPage.INPUT_SUBJECTS),
            JavaScriptClick.on(RegisterFormPage.CHECKBOX_HOBBIES),
            Enter.keyValues(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 5)).into(RegisterFormPage.SELECT_UPLOAD),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 6)).into(RegisterFormPage.ADDRESS_CURRENT_INPUT),

            JavaScriptClick.on(RegisterFormPage.INPUT_STATE),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 7)).into(RegisterFormPage.INPUT_STATE).thenHit(Keys.ENTER),

            JavaScriptClick.on(RegisterFormPage.CITY_INPUT),
            Enter.theValue(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 8)).into(RegisterFormPage.CITY_INPUT).thenHit(Keys.ENTER),

            JavaScriptClick.on(RegisterFormPage.SUBMIT_BUTTON)


    );
}catch (IOException e){
    e.printStackTrace();
}


    }

    public static FillAllFillsExcel dataInjection(){
        return instrumented(FillAllFillsExcel.class);
    }
}