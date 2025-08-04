package DuplicateNumbers;

import java.util.HashSet;

class DuplicateNumbersByUsingHashSet {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet();
        for(int value : nums) {
            if(!seen.add(value)) {
                duplicate.add(value);
                return true;
            }
        }
        System.out.println(duplicate);
        return flag;
    }
}

class MainMethod {
    public static void main(String[] args) {
        DuplicateNumbersByUsingHashSet dnbuhs = new DuplicateNumbersByUsingHashSet();
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        System.out.println("Duplicate Numbers: " + dnbuhs.containsDuplicate(nums));
    }
}
