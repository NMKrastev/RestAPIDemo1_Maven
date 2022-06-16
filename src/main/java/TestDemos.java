import org.testng.annotations.Test;

public class TestDemos {

    @Test
    void setup() {
        System.out.println("I'm inside setup");
    }

    @Test
    void testSteps() {
        System.out.println("I'm inside testSteps");
    }

    @Test
    void tearDown() {
        System.out.println("I'm inside tearDown");
    }
}
