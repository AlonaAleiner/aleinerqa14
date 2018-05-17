package com.telran.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {

    @Test
    public void contactTestDelition() {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().editContact();
        app.getContactHelper().deleteContact();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }
}

