import java.util.Scanner;
//Kushal Rajani
class BubbleSort {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, n, ele[], j, temp;

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

            for (i = 0; i < n; i++)
                for (j = 0; j < n - i - 1; j++)
                    if (ele[j] > ele[j + 1]) {
                        temp = ele[j];
                        ele[j] = ele[j + 1];
                        ele[j + 1] = temp;
                    }

            System.out.println("\n\nThe elements of the array after Bubble Sorting: ");
            for (i = 0; i < n; i++)
                System.out.print(ele[i] + ", ");
        }
    }
}