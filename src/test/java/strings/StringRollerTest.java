package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRollerTest {

    @Test
    public void rotateLeft_1() {
        // given
        String str = "abcd";

        // when
        String actual = new StringRoller(str).rotate(StringRoller.Direction.Left, 1);

        // then
        assertEquals("bcda", actual);
    }

    @Test
    public void rotateLeft_2() {
        // given
        String str = "abcd";

        // when
        String actual = new StringRoller(str).rotate(StringRoller.Direction.Left, 2);

        // then
        assertEquals("cdab", actual);
    }

    @Test
    public void rotateLeft_size() {
        // given
        String str = "abcd";

        // when
        String actual = new StringRoller(str).rotate(StringRoller.Direction.Left, str.length());

        // then
        assertEquals("abcd", actual);
    }

    @Test
    public void rotateRight_1() {
        // given
        String str = "abcd";

        // when
        String actual = new StringRoller(str).rotate(StringRoller.Direction.Right, 1);

        // then
        assertEquals("dabc", actual);
    }

    @Test
    public void rotateRight_2() {
        // given
        String str = "abcd";

        // when
        String actual = new StringRoller(str).rotate(StringRoller.Direction.Right, 2);

        // then
        assertEquals("cdab", actual);
    }

    @Test
    public void rotateRight_size() {
        // given
        String str = "abcd";

        // when
        String actual = new StringRoller(str).rotate(StringRoller.Direction.Right, str.length());

        // then
        assertEquals("abcd", actual);
    }

    @Test
    public void rotateLeftAndRight() {
        // given
        String str = "abcd";

        // when
        String actual = new StringRoller(str).rotate(StringRoller.Direction.Left, 1);
        actual = new StringRoller(actual).rotate(StringRoller.Direction.Right, 1);

        // then
        assertEquals("abcd", actual);
    }
}