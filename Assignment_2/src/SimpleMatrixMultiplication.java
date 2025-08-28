import java.util.Scanner;

public class SimpleMatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First matrix size
        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        // Second matrix size
        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];
        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Validation
        if (c1 != r2) {
            System.out.println("Multiplication not possible!");
        } else {
            int[][] C = new int[r1][c2];

            // Multiply
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // Print result
            System.out.println("Result:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
