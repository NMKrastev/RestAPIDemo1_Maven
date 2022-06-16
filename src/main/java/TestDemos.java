import org.testng.annotations.Test;

public class TestDemos {

    @Test (priority = 1)
    void setup() {
        System.out.println("I'm inside setup");
    }

    @Test (priority = 2)
    void testSteps() {
        System.out.println("I'm inside testSteps");
    }

    @Test (priority = 3)
    void tearDown() {
        System.out.println("I'm inside tearDown");
    }
}
