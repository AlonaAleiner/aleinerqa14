import com.telran.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

public class CreateGroupTest extends TestBase {

    @Test(priority = 2)
    public void testCreateGroupLongName() {
        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.createNewGroup();
        app.fillGroupForm(new GroupData("Name", "Header", "Footer"));
        app.submitGroupCreating();
        int after = app.getGroupCount();
        /* System.out.println("testCreateGroupLongName passed");*/
        Assert.assertEquals(after, before + 1);
    }

    @Test(priority = 1)
    public void testCreateGroupShortName() {
        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.createNewGroup();
        app.fillGroupForm(new GroupData("N", "H", "F"));
        app.submitGroupCreating();
        int after = app.getGroupCount();
        Assert.assertEquals(after, before + 1);
        System.out.println("testCreateGroupShortName passed");
    }

    @Test(priority = 3, enabled = false)
    public void testCreateGroupEmpty() {
        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.createNewGroup();
        app.fillGroupForm(new GroupData("", "", ""));
        app.submitGroupCreating();
        int after = app.getGroupCount();
        Assert.assertEquals(after, before + 1);
    }
}
