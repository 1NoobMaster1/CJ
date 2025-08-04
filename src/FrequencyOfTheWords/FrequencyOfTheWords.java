package FrequencyOfTheWords;

import java.util.List;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfTheWords {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "orange", "pineapple");
        List<String> list2 = Arrays.asList("apple", "banana", "grapes", "orange", "orange");

        // Map<String, Long> frequency = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        Map<String, Long> frequency = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(frequency);

    }
}
