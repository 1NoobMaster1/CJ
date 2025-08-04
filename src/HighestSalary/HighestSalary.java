package HighestSalary;

import java.util.Arrays;

public class HighestSalary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int nums = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted((a, b) -> b - a)
                // .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(nums);
    }
}
