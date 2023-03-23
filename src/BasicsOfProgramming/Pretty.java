package BasicsOfProgramming;

import java.util.Scanner;

public class Pretty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[4][4];

        System.out.println("Enter the matrix:");

        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        boolean pretty = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == matrix[i][j+1] &&
                        matrix[i][j] == matrix[i+1][j]) {
                    pretty = false;
                    break;
                }
            }
            if (!pretty) {
                break;
            }
        }

        if (pretty) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
