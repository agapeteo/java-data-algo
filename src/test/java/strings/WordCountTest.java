package strings;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {

    @Test
    public void wordCount() {
        // given
        String text = "long long long way to to my home";

        // when
        Map<String, Long> actual = WordCount.lambdaWordCount(text);

        // then
        assertEquals(3, actual.get("long"));
        assertEquals(2, actual.get("to"));
        assertEquals(1, actual.get("home"));
        assertEquals(1, actual.get("way"));
    }

}