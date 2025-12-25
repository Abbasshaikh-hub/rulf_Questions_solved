import java.util.Scanner;

public class sumAllOddNumers {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer (n): ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++) {
            if (i % 2 !=0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}
