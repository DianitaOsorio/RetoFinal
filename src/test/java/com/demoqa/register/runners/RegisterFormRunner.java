package com.demoqa.register.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
        glue = "com.demoqa.register.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = " @smokeTest or @smokeTestFaker or @smokeTestProperties")
public class RegisterFormRunner {


}
