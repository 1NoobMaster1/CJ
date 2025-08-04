package Palindrome;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        int n, sum = 0;
        n = sc.nextInt();
        int temp = n;
        while(n > 0) { // 123, 12, 1
            int b;
            b = n % 10; // 123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1
            sum = (sum * 10) + b; // 3, 32, 321
            n = n/10; // 123/10 = 12, 12/10 = 1, 1/10 = 0
        }
        System.out.println(sum);
        if(temp == sum) {
            System.out.println("Palindrome Number!");
        } else {
            System.out.println("!Palindrome Number!");
        }
    }
}
