package BasicsOfProgramming;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            for(int m=1; m<=i; m++)
                System.out.print(m);
            System.out.println("");
        }
    }
}
