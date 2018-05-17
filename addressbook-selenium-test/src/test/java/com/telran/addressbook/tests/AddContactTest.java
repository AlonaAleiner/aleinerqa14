package com.telran.addressbook.tests;

import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.*;

import org.openqa.selenium.*;

public class AddContactTest extends TestBase {

    @Test
    public void testAddContact1() throws Exception {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().addContact(By.linkText("add new"));
        app.getContactHelper().fillContactForm(new ContactData("John", "Name", "Smith", "Jonny", "Title", "Company", "Address", "Home", "Mobile", "Work", "Fax", "e-mail", "facebook.jonny.ru", "1", "January", "1980"));
        app.getGroupHelper().selectGroupToAdding();
        app.getContactHelper().submitContactAdding();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }

    @Test
    public void testAddContact2() throws Exception {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().addContact(By.linkText("add new"));
        app.getContactHelper().fillContactForm(new ContactData("Ann", "Eve", "York", "Ann111", "Title", "Company", "Address", "Home", "0509998877", "Work", "Fax", "ann111@gmail.com", "facebook.ann111.ru", "2", "February", "1982"));
        app.getGroupHelper().selectGroupToAdding();
        app.getContactHelper().submitContactAdding();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }
}