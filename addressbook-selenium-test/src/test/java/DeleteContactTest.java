
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {
    @Test
    public void contactTestDelition() {
        int before = app.getContactCount();
        app.editContact();
        app.deleteContact();
        int after = app.getContactCount();
        Assert.assertEquals(after, before - 1);


    }
}

