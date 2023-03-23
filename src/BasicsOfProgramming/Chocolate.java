package BasicsOfProgramming;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter m:");
        int m = sc.nextInt();
        System.out.print("Enter k:");
        int k = sc.nextInt();

        if (k<=n*m && (k%n==0 || k%m==0)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
