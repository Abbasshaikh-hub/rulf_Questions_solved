import java.util.Scanner;

public class LCM {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b,a % b);
    }
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / findGCD(a, b);
    }
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 18;
        System.out.println("The LCM of" + num1 + "and" + num2 + "is: " + findLCM(num1, num2));
    }
}
