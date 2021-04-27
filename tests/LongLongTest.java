import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongLongTest {

    @Test
    void OR() {
        LongLong test1 = new LongLong(0,0);
        LongLong test = new LongLong(0b000000000000000000000000000000000000000000000000000000000000001L,0);
        System.out.println(test.OR(test1));
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
        LongLong test = new LongLong(0,0b1000000000000000000000000000000000000000000000000000000000000000L);
        System.out.println(test);
        test = test.LSHIFT(1);
        System.out.println(test);
    }
}