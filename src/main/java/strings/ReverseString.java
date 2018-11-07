package strings;

public class ReverseString {
    private final String str;

    public ReverseString(String str) {
        this.str = str;
    }

    public String reversed(){
        if (str == null || str.length() < 1) return str;

        char[] chars = str.toCharArray();

        int i = 0;
        int j = chars.length - 1;
        while (i < j){
            swap(chars, i, j);
            i++;
            j--;
        }
        return new String(chars);
    }

    private void swap(char[] chars, int leftIdx, int rightIdx) {
        char leftChar = chars[leftIdx];
        char rightChar = chars[rightIdx];
        chars[leftIdx] = rightChar;
        chars[rightIdx] = leftChar;
    }
}
