package com.telran.addresbook.appManadger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{



    public NavigationHelper(WebDriver driver) {
       super(driver);
    }

    public void goToGroopsPage() {
        if(isElementPresent(By.tagName("h1"))&&driver.findElement(By.name("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))){
            return;
        }
click(By.linkText("groups"));

    }
}
