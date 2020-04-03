package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordCount {

    public static Map<String, Integer> workCount(String text) {
        Map<String, Integer> result = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            Integer count = result.get(word);
            if (count == null) {
                result.put(word, 1);
            } else {
                result.put(word, count + 1);
            }
        }
        return result;
    }

    public static Map<String, Long> lambdaWordCount(String text) {
        return Arrays.asList(text.split(" "))
                .stream()
                .collect(
                        groupingBy(
                                Function.identity(), counting()));
    }
}
