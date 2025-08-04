package DuplicateNumbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
        List<Integer> duplicates = numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Duplicate Numbers: " + duplicates);
    }
}
