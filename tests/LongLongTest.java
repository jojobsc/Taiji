import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongLongTest {

    @Test
    void OR() {
    }

    @Test
    void AND() {
    }

    @Test
    void NEG() {
    }

    @Test
    void RSHIFT() {
        LongLong test = new LongLong(0b0000111111111111111111111111111111111111111111111111111110000001L,0b0001111111111111111111111111111111111111111111111111111110000000L);
        System.out.println(test);
        test = test.RSHIFT(10);
        System.out.println(test);
    }

    @Test
    void LSHIFT() {
        LongLong test = new LongLong(0b0000111111111111111111111111111111111111111111111111111110000001L,0b0001111111111111111111111111111111111111111111111111111110000000L);
        System.out.println(test);
        test = test.LSHIFT(10);
        System.out.println(test);
    }
}