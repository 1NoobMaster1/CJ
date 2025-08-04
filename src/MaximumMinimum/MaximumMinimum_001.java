package MaximumMinimum;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaximumMinimum_001 {
    public static void main(String[] args) {
        IntStream numbers = Arrays.stream(new int[] {1, 2, 3, 4, 5});
        OptionalInt maximum = numbers.max();
        OptionalInt minimum = Arrays.stream(new int[] {1, 2, 3, 4, 5}).min();
        maximum.ifPresent(value -> System.out.println(value));
        minimum.ifPresent(value -> System.out.println(value));
    }
}
