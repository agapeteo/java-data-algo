package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void permute() {
        Permutations permutations = new Permutations("abc");
        permutations.permute();
    }
}