package com.telran.addresbook.tests;

import com.telran.addresbook.madel.GruopData;
import org.testng.Assert;
import org.testng.annotations.*;

public class CreateGroupTestt extends TestBase {




    @Test(priority = 2)
    public void testCreateGroupTesttLongName(){

        app.getNavigationHelper().goToGroopsPage();

        int before= app.getGroupHelper().getGroupCount();

        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GruopData("name", "header", "footer"));
        app.getGroupHelper().submitGruopCreation();
        app.getGroupHelper().returnToGroupPage();

        int after= app.getGroupHelper().getGroupCount();

        //System.out.println("testCreateGroupTesttLongName() passed");
        Assert.assertEquals(after,before+1);
    }
    @Test (priority = 1)
    public void testCreateGroupTesttShortName(){

        app.getNavigationHelper().goToGroopsPage();
        int before= app.getGroupHelper().getGroupCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GruopData("n", "h", "f"));
        app.getGroupHelper().submitGruopCreation();
        app.getGroupHelper().returnToGroupPage();
        int after= app.getGroupHelper().getGroupCount();
       // System.out.println("testCreateGroupTesttShortName() passed");
        Assert.assertEquals(after,before+1);
    }


    @Test (priority = 3,enabled = false)
    public void testCreateGroupTesttEmpty(){
        ;
        app.getNavigationHelper().goToGroopsPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GruopData("", "", ""));
        app.getGroupHelper().submitGruopCreation();
        app.getGroupHelper().returnToGroupPage();
        System.out.println("testCreateGroupTesttEmpty()  passed");
    }

}

