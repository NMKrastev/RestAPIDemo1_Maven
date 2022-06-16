import org.testng.annotations.Test;

public class TestAPIList {
    APIList testDemo = new APIList();
    @Test
    void demoOne() {
        testDemo.getAPIResponseListOne();
    }

    @Test
    void demoTwo() {
        testDemo.getAPIResponseListTwo();
    }
}
