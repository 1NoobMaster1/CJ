package FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]) {
        System.out.println("Enter a number: ");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("0");
        } else if(n == 2) {
            System.out.println("0");
            System.out.println("1");
        } else {
            int a = 0;
            int b = 1;
            n = n - 2;
            while(n > 0) {
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
                n = n - 1;
            }
        }
    }
}
