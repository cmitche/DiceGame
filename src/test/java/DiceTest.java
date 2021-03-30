import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void tossAndSumNotNull() {
        Dice dice = new Dice(2);
        int actual = dice.tossAndSum();
        assertNotNull(actual);
        System.out.println("Not null test: " + actual);
    }

    @Test
    void tossAndSum() {
        Dice dice = new Dice(2);
        int actual = dice.tossAndSum();
        assertTrue(actual > 0 && actual <= 12);
        System.out.println("Number > 0 && <= 12 test: " + actual);
    }
}
