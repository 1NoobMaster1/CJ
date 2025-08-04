package Reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        Collections.reverse(l);
        System.out.println(l);
    }
}
