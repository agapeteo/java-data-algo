package bits;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BitManipulationsTest {

    @Test
    void oneFromBinary() {
        assertEquals(2, BitManipulations.twoInBinary());
    }

    @Test
    void toBinaryStr() {
        assertEquals("10", BitManipulations.toBinaryStr(2));
        assertEquals("111", BitManipulations.toBinaryStr(7));
    }

    @Test
    void checkBitSet() {
        assertTrue(BitManipulations.checkBitSet(2, 0b100100));
        assertTrue(BitManipulations.checkBitSet(1, 0b100010));
        assertFalse(BitManipulations.checkBitSet(2, 0b100010));
    }

    @Test
    void setBit() {
        // given
        int number = 0b01;

        // when
        int actual = BitManipulations.setBit(1, number);

        // then
        assertEquals(0b11, actual);
    }


    @Test
    void clearBit() {
        assertEquals(0b101, BitManipulations.clearBit(1, 0b111));
    }

    @Test
    void toggleBit() {
        assertEquals(0b101, BitManipulations.toggleBit(1, 0b111));
        assertEquals(0b000, BitManipulations.toggleBit(1, 0b010));
    }

    @Test
    void isEven() {
        assertTrue(BitManipulations.isEven(4));
        assertTrue(BitManipulations.isEven(10));
        assertFalse(BitManipulations.isEven(5));
        assertFalse(BitManipulations.isEven(1));
    }
}