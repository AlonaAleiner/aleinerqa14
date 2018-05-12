import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateContactTest extends TestBase {
    @Test
    public void contactTestUpdate() {
        int before = app.getContactCount();
        app.editContact();
        app.updateContact();
        int after = app.getContactCount();
        Assert.assertEquals(after, before);


    }
}

