import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getBin() {

    }

    @Test
    void incrementBin() {
        Bins bins = new Bins(2, 12);

        //when
        bins.incrementBin(2);

        //then
        System.out.println(bins.getBin(2));
        System.out.println(bins.getBin(3));
        assertEquals(bins.getBin(2), 0);
    }
}
