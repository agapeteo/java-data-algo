package bits;

public class BitManipulations {

    public static int twoInBinary() {
        return 0b10;
    }

    public static String toBinaryStr(int number) {
        return Integer.toBinaryString(number);
    }

    public static boolean checkBitSet(int idx, int number) {
        int mask = 1 << idx;
        return ((number & mask) != 0);
    }

    public static int setBit(int idx, int number) {
        int mask = 1 << idx;
        return number | mask;
    }

    public static int clearBit(int idx, int number) {
        int mask = ~(1 << idx);
        return number & mask;
    }

    public static int toggleBit(int idx, int number) {
        int mask = 1 << idx;
        return number ^ mask;
    }

    public static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}
