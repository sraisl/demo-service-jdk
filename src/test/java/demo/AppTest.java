package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void greetingContainsProjectName() {
        assertEquals("Hallo von demo-service-jdk!", App.greeting());
    }
}
