import java.util.Scanner;

class QuickSort1 {
    static void sort(int arr[], int low, int high) {
        int piv;
        if (low < high) {
            piv = divide(arr, low, high);

            sort(arr, low, piv - 1);
            sort(arr, piv + 1, high);
        }
    }

    static int divide(int arr[], int low, int high) {
        int temp, piv = arr[high], i, j = (low - 1);

        for (i = low; i < high; i++) {
            if (arr[i] <= piv) {
                j++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        temp = arr[j + 1];
        arr[j + 1] = arr[high];
        arr[high] = temp;

        return j + 1;
    }

    static void print(int arr[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[], n, i;

            System.out.print("Enter array size: ");
            n = sc.nextInt();

            arr = new int[n];

            for (i = 0; i < n; i++) {
                System.out.print("Enter element #" + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.println("\nThe elements of the array before sorting: ");
            print(arr, n);

            sort(arr, 0, n - 1);

            System.out.println("\nThe elements of the array after sorting: ");
            print(arr, n);
        }
    }
}