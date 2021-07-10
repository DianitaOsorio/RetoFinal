package com.demoqaautomation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("es-ES"));

    private String name, lastName, email,  currentAddress, extensionName, extensionEmail,
            extensionCurrentAddress, extensionPermanentAddress, filepath, sheetName,  birthday, picture,subject,city,state,numberMobile;


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNumberMobile() {
        return numberMobile;
    }

    public String getEmail() {
        return email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public String getExtensionCurrentAddress() {
        return extensionCurrentAddress;
    }

    public String getExtensionEmail() {
        return extensionEmail;
    }

    public String getFilepath() {
        return filepath;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getSubject() {
        return subject;
    }

    public String getPicture() { return picture;}

    public String getCity(){
        return this.city;
    }

    public String getState(){
        return this.state;
    }

    public String getBirthday() { return birthday; }



    public DataInjection() { //constructor
        this.name = faker.name().name();
        this.email = faker.internet().emailAddress();
        this.lastName = faker.name().lastName();
        this.birthday = faker.date().birthday().toString();
        this.state = "NCR";
        this.city = "Delhi";
        this.subject = "Economics";
        this.numberMobile = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.currentAddress = faker.address().secondaryAddress();
        this.extensionName = "name:";
        this.extensionEmail = "Email:";
        this.extensionCurrentAddress = "Current Address :";
        this.extensionPermanentAddress = "Permanent Address";
        this.filepath = "resources/DataInjection.xlsx";
        this.sheetName = "DataExcel";
        this.picture = "C:\\Users\\Lulu\\Pictures\\img1.jpg";


    }
}
