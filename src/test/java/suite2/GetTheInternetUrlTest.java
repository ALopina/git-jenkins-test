package suite2;


import base.BaseTest;
import org.testng.annotations.Test;

public class GetTheInternetUrlTest extends BaseTest {

    @Test

    public void getUrl() {
        BaseTest test = new BaseTest();
        test.getTheInternetUrl();

    }
}
