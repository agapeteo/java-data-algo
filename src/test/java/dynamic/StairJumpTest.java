package dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StairJumpTest {

    @Test
    void waysCount() {
        System.out.println(StairJump.waysCount(5, new int[]{1, 2, 5}));
    }
}