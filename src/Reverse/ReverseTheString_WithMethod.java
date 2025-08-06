package Reverse;

import java.util.Scanner;

public class ReverseTheString_WithMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String: ");
        String something;
        something = sc.nextLine();
        String reversed = new StringBuffer(something).reverse().toString();
        System.out.println(reversed);
    }
}
