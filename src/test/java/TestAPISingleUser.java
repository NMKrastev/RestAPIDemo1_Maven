import org.testng.annotations.Test;

public class TestAPISingleUser {
    APISingleUser testDemo = new APISingleUser();
    @Test
    void demoOne() {
        testDemo.getAPIResponseSingleUserOne();
    }

    @Test
    void demoTwo() {
        testDemo.getAPIResponseSingleUserTwo();
    }
}
