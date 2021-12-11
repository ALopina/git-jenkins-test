package suite1;


import base.BaseTest;
import org.testng.annotations.Test;

public class GetGoogleUrlTest extends BaseTest {


    @Test

    public void getUrl() {

        BaseTest test = new BaseTest();
        test.getGoogleUrl();
    }
}
