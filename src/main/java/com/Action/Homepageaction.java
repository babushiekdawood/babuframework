package com.Action;

import com.UIobject.HomepageObject;
import com.toolbox.Element;
import com.toolbox.Sync;
import org.openqa.selenium.WebDriver;

/**
 * Created by Babu on 13-08-2017.
 */
public class Homepageaction extends HomepageObject {

    public Homepageaction(WebDriver driver) {
        super(driver);
    }


    public boolean LoginHomepage() {
        boolean loginHomepage = false;
        {
            try {
                Sync.implicitewait();
                //Sync.Explicitewait(driver, LoggedUsername);

                Element.Verify(driver, LoggedUsername1);
                loginHomepage = true;
            } catch (Exception e) {
                System.out.println(e);
            }
            return loginHomepage;
        }
    }
}
