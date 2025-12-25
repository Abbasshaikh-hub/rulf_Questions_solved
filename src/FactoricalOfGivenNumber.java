public class FactoricalOfGivenNumber {
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negetive numbers.");
        }
        if (n == 0){
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void main() {
        FactoricalOfGivenNumber calculator = new FactoricalOfGivenNumber();

        int number1 = 5;
        long result1 = calculator.calculateFactorial(number1);
        System.out.println("Factorial of " + number1 + " is: " + result1);

        int number2 = 0;
        long result2 = calculator.calculateFactorial(number2);
        System.out.println("Factorial of " + number2 + " is: " + result2);

        try {
            int number3 = -3;
            calculator.calculateFactorial(number3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
