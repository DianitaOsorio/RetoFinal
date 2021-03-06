package com.demoqaautomation.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SpecialMethods {

    private static int consecutivo = 0;
    public static Properties properties;

    public static void configProperties() {
        properties = new Properties();
        try {
            properties.load(new FileReader("conf.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void waitFor(int segundos) throws InterruptedException {
            Thread.sleep(segundos*1000);
        }

        public static void takeScreenShotShortPage (WebDriver driver){
            try {

                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("C:\\Users\\Lulu\\Desktop\\Semillero Automatizaciòn SQA\\MyRetoScreenPLayLogin\\Screenshot\\lulu_" +consecutivo+".jpg"));
                consecutivo++;
            } catch (IOException errorsito) {
                errorsito.printStackTrace();
            }
        }

    }




