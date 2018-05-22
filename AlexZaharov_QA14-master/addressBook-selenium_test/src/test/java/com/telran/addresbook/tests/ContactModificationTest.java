package com.telran.addresbook.tests;

import com.telran.addresbook.madel.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
            public void contactModification(){
        int before= app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillCantactForms(new ContactData("New Alex", "New Zaharov", "New QaDream", "Israil", "666", "new reshef@gmail.com"));
        app.getContactHelper().confirmContactModification();
        int after= app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before);

    }


}
