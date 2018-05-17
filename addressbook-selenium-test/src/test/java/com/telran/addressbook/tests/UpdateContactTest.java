package com.telran.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateContactTest extends TestBase {

    @Test
    public void contactTestUpdate() {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().editContact();
        app.getContactHelper().updateContact();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);
    }
}

