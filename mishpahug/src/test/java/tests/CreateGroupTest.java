package tests;

import com.telran.addressbook.model.GroupData;
import org.testng.Assert;

public class CreateGroupTest extends TestBase {

    @Test(priority = 2)
    public void testCreateGroupLongName() {
        app.getNavigationHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createNewGroup();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .withName("")
                .withHeader("")
                .withFooter(""));
        app.getGroupHelper().submitGroupCreating();
        int after = app.getGroupHelper().getGroupCount();
        /* System.out.println("testCreateGroupLongName passed");*/
        Assert.assertEquals(after, before + 1);
    }

    @Test(priority = 1)
    public void testCreateGroupShortName() {
        app.getNavigationHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createNewGroup();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .withName("Only name"));
        app.getGroupHelper().submitGroupCreating();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);
        System.out.println("testCreateGroupShortName passed");
    }

    @Test(priority = 3, enabled = false)
    public void testCreateGroupEmpty() {
        app.getNavigationHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createNewGroup();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .withName("")
                .withFooter(""));
        app.getGroupHelper().submitGroupCreating();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);
    }
}
