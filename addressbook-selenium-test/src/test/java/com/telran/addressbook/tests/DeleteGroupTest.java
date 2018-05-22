package com.telran.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteGroupTest extends TestBase {

    @Test
    public void groupTestDelition() {
        app.getNavigationHelper().goToGroupsPage();
        if(!app.getGroupHelper().isThereAGruop()){
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        org.testng.Assert.assertEquals(after, before - 1);
    }
}



