import java.util.Scanner;

class MergeSortArrays {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, j, x = 0, y = 0, temp = 0, X[], Y[], Z[];

            System.out.print("Enter the no. of integers to store in array X[]: ");
            x = sc.nextInt();
            System.out.print("Enter the no. of integers to store in array Y[]: ");
            y = sc.nextInt();

            X = new int[x];
            Y = new int[y];
            Z = new int[x + y];

            System.out.println("\nEnter the elements of X[] array: ");
            for (i = 0; i < x; i++) {
                System.out.print("Enter Element #" + (1 + i) + ": ");
                X[i] = sc.nextInt();
            }

            System.out.println("\nEnter the elements of Y[] array: ");
            for (i = 0; i < y; i++) {
                System.out.print("Enter Element #" + (1 + i) + ": ");
                Y[i] = sc.nextInt();
            }
            // Merging of the two given arrays happening below:
            for (i = 0; i < x; i++)
                Z[i] = X[i];
            for (i = 0; i < y; i++)
                Z[x + i] = Y[i];

            // Merged array getting sorted below:
            for (i = 0; i < x + y; i++)
                for (j = 0; j < (x + y) - i - 1; j++)
                    if (Z[j] > Z[j + 1]) {
                        temp = Z[j];
                        Z[j] = Z[j + 1];
                        Z[j + 1] = temp;
                    }

            System.out.println("\nElements as stored in first array 'X': ");
            for (i = 0; i < x; i++)
                System.out.print(X[i] + ", ");
            System.out.println("\n\nElements as stored in second array 'Y': ");
            for (i = 0; i < y; i++)
                System.out.print(Y[i] + ", ");
            System.out.println("\n\nElements as stored in third array 'Z': ");
            for (i = 0; i < x + y; i++)
                System.out.print(Z[i] + ", ");
        }
    }
}