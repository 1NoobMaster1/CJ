package Reverse;

import java.util.ArrayList;

public class ReverseTheArrayList_WithoutMethod {
     public static void main(String[] args) {
         ArrayList<Integer> original = new ArrayList<>();
         original.add(1);
         original.add(2);
         original.add(3);
         original.add(4);
         original.add(5);
         ArrayList<Integer> reversed = new ArrayList<>();
         for(int i = original.size() - 1; i >= 0; i--) {
             reversed.add(original.get(i));
         }
         System.out.println("Original Number: " + original);
         System.out.println("Reversed Number: " + reversed);
     }
}
