package Arrays;

import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        int n1 = sc.nextInt();
        // System.out.println("Enter a number: ");
        int n2 = sc.nextInt();
        int[][] arr = new int[n1][n2];
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
