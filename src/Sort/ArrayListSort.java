package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 1);
        Collections.sort(l);
        System.out.println(l);
    }
}
