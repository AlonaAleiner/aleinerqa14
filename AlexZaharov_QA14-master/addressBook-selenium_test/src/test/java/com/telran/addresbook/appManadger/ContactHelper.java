package com.telran.addresbook.appManadger;


import com.telran.addresbook.madel.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper  extends  HelperBase{



    public ContactHelper (WebDriver driver) {
       super(driver);
    }

    public void confirmContactModification() {
        driver.findElement(By.name("update")).click();
    }

    public void clickEnter() {
        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }


    public void createKontakt() {
       driver.findElement(By.linkText("add new")).click();
    }

    public void inputMobile(String mobile) {
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
       driver.findElement(By.name("mobile")).sendKeys(mobile);
    }

    public void inputAddress(String address) {
       driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys(address);
    }

    public void inputCompany(String company) {
       driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
       driver.findElement(By.name("company")).sendKeys(company);
    }

    public void inputLastName(String lastName) {
       driver.findElement(By.name("lastname")).click();
       driver.findElement(By.name("lastname")).clear();
       driver.findElement(By.name("lastname")).sendKeys(lastName);
    }

    public void inputFirstName(String firstName) {
       driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
       driver.findElement(By.name("firstname")).sendKeys(firstName);
    }

    public void selectContakt() {
        driver.findElement(By.xpath("//input[@name='selected[]']")).click();
    }



    public int getContactCount() {
      return driver.findElements(By.xpath("//input[@name='selected[]']")).size();
    }

    public void initContactModification() {
       driver.findElement(By.xpath("//img[@title='Edit']")).click();
    }

    public void fillCantactForms(ContactData contactData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());

       driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());

        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(contactData.getCompany());

        driver.findElement(By.name("address")).click();
       driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(contactData.getAddress());

        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
       driver.findElement(By.name("mobile")).sendKeys(contactData.getMobile());

       driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(contactData.getEmail());


    }

    public void inputEmail(String email) {
        driver.findElement(By.name("email")).click();
       driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void deleteContakt() {
       driver.findElement(By.xpath("//*[@value='Delete']")).click();


    }
}
