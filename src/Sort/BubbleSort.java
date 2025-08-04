package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        for(int i = 0; i < (n - 1); i++) {
            for(int j = 0; j < (n - 1); j++) {
                if(arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int value : arr) {
            System.out.println(value);
        }
    }
}
