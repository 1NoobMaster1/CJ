package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i * i <= n; i++) {
                if(n % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println(n + " is a Prime Number!");
        } else {
            System.out.println(n + " is not a Prime Number!");
        }
    }
}
