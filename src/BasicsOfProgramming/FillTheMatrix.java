package BasicsOfProgramming;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j] = Math.abs(j-i);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
