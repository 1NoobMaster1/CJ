package DuplicateNumbers;

import java.util.HashSet;

class DuplicateNumbersHashSet {
    public static void main(String[] args) {
        boolean flag = false;
        int[] nums = {1, 1, 2, 2, 3};

        HashSet<Integer> duplicate = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();

        for(int value : nums) {
            if(!seen.add(value)) {
                duplicate.add(value);
                flag = true;
            }
        }
        System.out.println(duplicate);
        System.out.println(flag);
        System.out.println(seen);
    }
}