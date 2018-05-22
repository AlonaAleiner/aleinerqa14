package com.telran.addresbook.tests;

import com.telran.addresbook.madel.GruopData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GruopModificationTest extends TestBase {

            @Test
    public  void testGroupModificationTest (){


                app.getNavigationHelper().goToGroopsPage();
                if(!app.getGroupHelper().isThereAGruop()){
                    app.getGroupHelper().createGroup();
                }
                int before= app.getGroupHelper().getGroupCount();
                app.getGroupHelper().selectGroup();
                app.getGroupHelper().initmodifyGroup();
                app.getGroupHelper().fillGroupForm(new GruopData("b", null, "new footer"));
                app.getGroupHelper().confirmGroupModification();
                app.getGroupHelper().returnToGroupPage();
                int after= app.getGroupHelper().getGroupCount();
                Assert.assertEquals(after,before);

            }



}
