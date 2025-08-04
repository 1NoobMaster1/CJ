package Reverse;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: );
        int n, sum = 0;
        n = sc.nextInt();
        int temp = n;
        while(n > 0) {
            int b;
            b = n % 10;
            sum = (sum * 10) + b;
            n = n/10;
        }
        System.out.println(sum);
    }
}
