package com.telran.addresbook.appManadger;

import com.telran.addresbook.madel.GruopData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends  HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }


    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGruopCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GruopData gruopData) {
        type(By.name("group_name"), gruopData.getName());
        type(By.name("group_header"), gruopData.getHeader());
        type(By.name("group_footer"), gruopData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }


    public void initmodifyGroup() {
        click(By.name("edit"));
    }

    public void confirmGroupModification() {
        click(By.name("update"));
    }

    //DelentGroup
    public void deleteGroup() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public boolean isThereAGruop() {

        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup() {
       initGroupCreation();
        fillGroupForm(new GruopData("n", "h", "f"));
       submitGruopCreation();
        returnToGroupPage();
    }
}
