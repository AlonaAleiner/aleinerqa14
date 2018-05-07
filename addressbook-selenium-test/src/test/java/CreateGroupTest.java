import org.testng.annotations.*;

public class CreateGroupTest extends TestBase {

    @Test(priority = 2)
    public void testCreateGroupLongName() {
        goToGroupsPage("groups");
        createNewGroup();
        fillGroupForm("Name", "Header", "Footer");
        submitGroupCreating();
        System.out.println("testCreateGroupLongName passed");
    }

    @Test(priority = 1)
    public void testCreateGroupShortName() {
        goToGroupsPage("groups");
        createNewGroup();
        fillGroupForm("N", "H", "F");
        submitGroupCreating();
        System.out.println("testCreateGroupShortName passed");
    }

    @Test(priority = 3, enabled = false)
    public void testCreateGroupEmpty() {
        goToGroupsPage("groups");
        createNewGroup();
        fillGroupForm("", "", "");
        submitGroupCreating();
    }
}
