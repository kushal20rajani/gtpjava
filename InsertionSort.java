import java.util.Scanner;
// Kushal Rajani
class InsertionSort {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, j, n, temp, arr[];

            System.out.print("Enter the size of the array: ");
            n = sc.nextInt();

            arr = new int[n];

            for (i = 0; i < n; i++) {
                System.out.print("Enter element #" + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.println("\nArray elements before sorting: ");
            for (i = 0; i < n; i++)
                System.out.print(arr[i] + ", ");

            for (i = 0; i < n - 1; i++) {
                j = i;
                while (j > 0 && arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    j--;
                }
            }

            System.out.println("\nArray elements after sorting: ");
            for (i = 0; i < n; i++)
                System.out.print(arr[i] + ", ");
        }

    }
}