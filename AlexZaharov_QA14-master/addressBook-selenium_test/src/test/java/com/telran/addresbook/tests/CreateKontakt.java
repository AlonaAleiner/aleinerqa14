package com.telran.addresbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class CreateKontakt  extends TestBase {

    @Test
    public void testCreateKontakt() throws Exception {
        int before= app.getContactHelper().getContactCount();
        app.getContactHelper().createKontakt();
        app.getContactHelper().inputFirstName("Alex");
        app.getContactHelper().inputLastName("Zaharov");
        app.getContactHelper().inputCompany("QaDream");
        app.getContactHelper().inputAddress("ssr");
        app.getContactHelper().inputMobile("0527576060");
        app.getContactHelper().inputEmail("reshef1986@gmail.com");
        app.getContactHelper().clickEnter();
        int after= app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);
    }


}
