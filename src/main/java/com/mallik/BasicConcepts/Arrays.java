package main.java.com.mallik.BasicConcepts;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int n = arr.length;

        // Print in normal order
        System.out.println("Array in normal order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print in reverse order
        System.out.println("\nArray in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
