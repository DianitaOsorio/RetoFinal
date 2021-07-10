package com.demoqaautomation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterFormPage {

    public static String URL = "https://www.demoqa.com/automation-practice-form";
    public static final Target INPUT_FIRSTNAME  = Target.the("").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("").located(By.id("lastName"));
    public static final Target INPUT_EMAIL_USER = Target.the("").located(By.id("userEmail"));
    public static final Target GENDER_RADIO  = Target.the("").locatedBy("//label[@for='gender-radio-2']");
    public static final Target INPUT_NUMBER= Target.the("").located(By.id("userNumber"));
    public static final Target INPUT_DATE_OF_BIRTH = Target.the("").located(By.id("dateOfBirthInput"));
    public static final Target MONTH_SELECT = Target.the("").locatedBy("//select[@class='react-datepicker__month-select']");
   public static final Target OPTION_MONTH= Target.the("").locatedBy("//*[@value='7' and text()='August']");
   public static final Target YEAR_SELECT= Target.the("").locatedBy("//*[@class='react-datepicker__year-select']");
   public static final Target OPTION_YEAR  = Target.the("").locatedBy("//*[@value='1978' and text()='1978']");
   public static final Target OPTION_DAY = Target.the("").locatedBy("//*[@class='react-datepicker__day react-datepicker__day--013' and text()='13']");
    public static final Target INPUT_SUBJECTS = Target.the("").locatedBy("//input[@id='subjectsInput']");
    public static final Target CHECKBOX_HOBBIES = Target.the("").locatedBy("//label[@for='hobbies-checkbox-1']");
    public static final Target SELECT_UPLOAD = Target.the("").located(By.id("uploadPicture"));
    public static final Target ADDRESS_CURRENT_INPUT = Target.the("").located(By.id("currentAddress"));
    public static final Target  INPUT_STATE= Target.the("").locatedBy("//*[@id='react-select-3-input' and @type='text']");
    public static final Target CITY_INPUT = Target.the("").locatedBy("//*[@id='react-select-4-input' and @type='text']");
    public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("submit"));
    public static final Target VALIDATION_OF_SUBMITTING_FORM = Target.the("").locatedBy("//*[@id='example-modal-sizes-title-lg' and text()='Thanks for submitting the form']");
    public static final Target CLOSE_BUTTON = Target.the("").locatedBy("//*[@id='closeLargeModal' and @type='button']");
}