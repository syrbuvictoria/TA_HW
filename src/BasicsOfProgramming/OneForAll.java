package BasicsOfProgramming;

public class OneForAll {
    public static void checkPositive (int a, int b, int c){
        int count = 0;
        if (a>0) {
            count++;
        }
        if (b>0){
            count++;
        }
        if (c>0)
        {
            count++;
        }

        if (count==1){
            System.out.println("true");
        }
        else {System.out.println("false");}
    }
    public static void main(String[] args) {
        checkPositive(20, 45, 66);
        checkPositive(6, 0, -3);
        checkPositive(0, -3, -2);
    }
}
