package com.telran.addressbook.appManager;

import com.telran.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewGroup() {
        driver.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void submitGroupCreating() {
        driver.findElement(By.name("submit")).click();
        goToGroupsPage();
    }

    private void goToGroupsPage() {
        driver.findElement(By.xpath("//a[@href='group.php']")).click();
    }

    public void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    public void deleteGroup() {
        driver.findElement(By.name("delete")).click();
    }

    public void selectGroupToAdding() {
        driver.findElement(By.name("new_group")).click();
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("Name");
        driver.findElement(By.name("new_group")).click();
    }

    public int getGroupCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public void initModifyGroup() {
        driver.findElement(By.xpath("//*[@value='Edit group']")).click();
    }

    public void submitGroupModification() {
        driver.findElement(By.cssSelector("input[name=update]")).click();
    }

    public void returnToGroupsPage() {
        driver.findElement(By.linkText("group page")).click();
    }
}
