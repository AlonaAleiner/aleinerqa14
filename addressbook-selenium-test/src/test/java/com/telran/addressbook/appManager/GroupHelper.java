package com.telran.addressbook.appManager;

import com.telran.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void createNewGroup() {
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void submitGroupCreating() {
        click(By.name("submit"));
        goToGroupsPage();
    }

    private void goToGroupsPage() {
        click(By.xpath("//a[@href='group.php']"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteGroup() {
        click(By.name("delete"));
    }

    public void selectGroupToAdding() {
        click(By.name("new_group"));
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public void initModifyGroup() {
        click(By.xpath("//*[@value='Edit group']"));
    }

    public void submitGroupModification() {
        click(By.cssSelector("input[name=update]"));
    }

    public void returnToGroupsPage() {
        click(By.linkText("group page"));
    }

    public boolean isThereAGruop() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup() {
        createNewGroup();
        fillGroupForm(new GroupData().withName("n").withHeader("h").withFooter("f"));
        submitGroupCreating();
        returnToGroupsPage();
    }
}



