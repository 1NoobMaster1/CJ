package Palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String: ");
        String something = sc.nextLine();
        String reversed = new StringBuffer(something).reverse().toString();
        System.out.println(reversed);
        if(reversed.equals(something)) {
            System.out.println("Palindrome String!");
        } else {
            System.out.println("!Palindrome String!");
        }
    }
}
