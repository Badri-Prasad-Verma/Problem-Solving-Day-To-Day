package Day13;

public class ArrayBlockSwapRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate
        int n = arr.length;

        // Handle cases where k > n or k < 0
        k = k % n; 
        if (k < 0) {
            k += n; // Convert negative rotations to positive
        }

        // Rotate the array
        rotateArray(arr, k, n);

        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to rotate the array
    static void rotateArray(int[] arr, int k, int n) {
        blockSwap(arr, 0, k, n);
    }

    // Block swap function
    static void blockSwap(int[] arr, int start, int k, int n) {
        if (k == 0 || k == n) {
            return; // No rotation needed
        }

        // Decide the size of A and B
        int A = k;         // Size of the left block
        int B = n - k;     // Size of the right block

        if (A <= B) {
            // Left block is smaller or equal
            swap(arr, start, start + n - k, A);
            blockSwap(arr, start, k, n - k);
        } else {
            // Right block is smaller
            swap(arr, start, start + k, B);
            blockSwap(arr, start + B, A - B, A);
        }
    }

    // Function to swap two blocks
    static void swap(int[] arr, int i, int j, int size) {
        for (int x = 0; x < size; x++) {
            int temp = arr[i + x];
            arr[i + x] = arr[j + x];
            arr[j + x] = temp;
        }
    }
}
