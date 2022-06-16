import org.testng.annotations.Test;

public class TestAPIList {
    APIList testDemo = new APIList();
    @Test
    void demoOne() {
        testDemo.APIListOne();
    }

    @Test
    void demoTwo() {
        testDemo.APIListTwo();
    }
}
