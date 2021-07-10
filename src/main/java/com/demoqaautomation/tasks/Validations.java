package com.demoqaautomation.tasks;

import com.demoqaautomation.models.DataInjection;
import com.demoqaautomation.questions.RegisterQuestion;
import com.demoqaautomation.ui.RegisterFormPage;
import com.demoqaautomation.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class Validations implements Task {
    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.should(
                    seeThat(RegisterQuestion.in(RegisterFormPage.VALIDATION_OF_SUBMITTING_FORM), equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilepath(), dataInjection.getSheetName(), 0, 9)))
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Validations compareText(){
        return instrumented(Validations.class);
    }
}

