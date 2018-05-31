package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {

    @Test
    public void contactTestDelition() {
        app.getNavigationHelper().returnHome();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().addContact();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().editContact();
        app.getContactHelper().deleteContact();
        app.getNavigationHelper().returnHome();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }
}
