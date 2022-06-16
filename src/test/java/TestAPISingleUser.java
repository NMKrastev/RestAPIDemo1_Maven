import org.testng.annotations.Test;

public class TestAPISingleUser {
    APISingleUser testDemo = new APISingleUser();
    @Test
    void demoOne() {
        testDemo.APISingleUserOne();
    }

    @Test
    void demoTwo() {
        testDemo.APISingleUserTwo();
    }
}
