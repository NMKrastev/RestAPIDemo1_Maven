import org.testng.annotations.Test;

public class TestAPIList {
    APIList testDemo = new APIList();
    @Test
    void demoOne() {
        testDemo.APIOne();
    }

    @Test
    void demoTwo() {
        testDemo.APITwo();
    }
}
