import java.util.Scanner;
//Kushal Rajani
class SelectionSort {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, n, ele[], j, temp, low, lowIndx = 0;

            System.out.print("Enter the number of elements: ");
            n = sc.nextInt();

            ele = new int[n];

            System.out.println();
            for (i = 0; i < n; i++) {
                System.out.print("Enter element #" + (i + 1) + ": ");
                ele[i] = sc.nextInt();
            }

            System.out.println("\nThe elements of the array before sorting: ");
            for (i = 0; i < n; i++)
                System.out.print(ele[i] + ", ");

            for (i = 0; i < n; i++) {
                low = ele[i];
                lowIndx = i;
                for (j = i + 1; j < n; j++) {
                    if (ele[j] < low) {
                        low = ele[j];
                        lowIndx = j;
                    }
                }
                temp = ele[i];
                ele[i] = ele[lowIndx];
                ele[lowIndx] = temp;
            }

            System.out.println("\n\nThe elements of the array after Selection Sorting: ");
            for (i = 0; i < n; i++)
                System.out.print(ele[i] + ", ");
        }
    }
}