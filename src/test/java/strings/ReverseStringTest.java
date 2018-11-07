package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reversed_hi() {
        assertEquals( "ih", new ReverseString("hi").reversed());
    }

    @Test
    void reversed_hola() {
        assertEquals( "aloh", new ReverseString("hola").reversed());
    }

    @Test
    void reversed_bla() {
        assertEquals("bla", new ReverseString("alb").reversed());
    }

    @Test
    void reversed_A() {
        assertEquals("A", new ReverseString("A").reversed());
    }
}