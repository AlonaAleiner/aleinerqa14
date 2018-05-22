package com.telran.addresbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {
    @Test
    public  void groupDeletionTest(){
        app.getNavigationHelper().goToGroopsPage();
        if(!app.getGroupHelper().isThereAGruop()){
            app.getGroupHelper().createGroup();
        }
        int before= app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
        int after= app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before-1);
    }




}
