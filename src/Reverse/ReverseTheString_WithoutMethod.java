package Reverse;

public class ReverseTheString_WithoutMethod {
    public static void main(String[] args) {
        String original = "Ayan";
        String reversed = "";
        for(int i = 0; i < original.length(); i++) {
            reversed = original.charAt(i) + reversed;
        }
        System.out.println(reversed);
    }
}
