import java.util.Scanner;

public class MultiplicationTable {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to display its multiplication table: ");

        int number = sc.nextInt();
        System.out.println("Multiplication Table for" + number + ":");

        for (int i=1; i<=10; i++) {
            int product = number * i;
            System.out.println(number + "X" + i + "=" + product);
        }
        sc.close();
    }
}
