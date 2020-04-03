package strings;

public class StringRoller {
    private final char[] chars;

    public enum Direction {Left, Right}

    public StringRoller(String str) {
        this.chars = str.toCharArray();
    }

    public String rotate(Direction direction, int count) {
        switch (direction) {
            case Left:
                for (int k = 0; k < count; k++) {
                    rotateLeft();
                }
                return new String(chars);
            case Right:
                for (int k = 0; k < count; k++) {
                    rotateRight();
                }
                return new String(chars);
            default:
                throw new UnsupportedOperationException();
        }
    }

    private void rotateLeft() {
        char first = chars[0];

        for (int i = 0; i < chars.length - 1; i++) {
            chars[i] = chars[i + 1];
        }
        chars[chars.length - 1] = first;
    }

    private void rotateRight() {
        char last = chars[chars.length - 1];

        for (int i = chars.length - 1; i > 0; i--) {
            chars[i] = chars[i - 1];
        }
        chars[0] = last;
    }
}
