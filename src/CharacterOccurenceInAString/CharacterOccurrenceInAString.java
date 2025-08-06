package CharacterOccurenceInAString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrenceInAString {
    public static void main(String[] args) {
        String input = "banana";
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj( c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(frequencyMap);
    }
}
