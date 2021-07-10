package com.demoqaautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterQuestion implements Question {

    private Target target;

    public RegisterQuestion(Target target){
        this.target = target;
    }


    @Override
    public Object answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }

    public static RegisterQuestion in (Target target){
        return new RegisterQuestion(target);
    }
}
