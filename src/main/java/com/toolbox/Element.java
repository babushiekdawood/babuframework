package com.toolbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Comparator;

/**
 * Created by in.Babushaik on 8/4/2017.
 */
public class Element  {

    public static boolean click(WebDriver driver, WebElement element) {
        boolean blResult = false;
        try {
            element.isDisplayed();
            element.click();
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }
    public static boolean Verify(WebDriver driver, WebElement element, String str) {
        boolean blVerify = false;
        try {

            element.isDisplayed();
            blVerify = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blVerify;
    }

    public static boolean Elementwait(WebDriver driver, WebElement element) {
        boolean blVerify = false;
        try {

            element.isDisplayed();
            blVerify = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blVerify;
    }

    public static boolean Entervalue(WebDriver driver, WebElement element, String Entervalue) {
        boolean blentervalue = false;
        try {
            element.isDisplayed();
            element.click();
            element.sendKeys(Entervalue);
            blentervalue = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blentervalue;
    }

}
