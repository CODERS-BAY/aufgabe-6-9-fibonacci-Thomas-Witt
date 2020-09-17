import java.util.Scanner;

public class fibomacci2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Die wie vielte Fibonacci Zahl möchtest du haben?");
        int counter = scanner.nextInt();

        System.out.println(calculateFibonacci(counter));
    }

    public static int calculateFibonacci(int indicator) {
        if (indicator == 0) {
            return 0;
        } else if (indicator == 1) {
            return 1;
        }
        return calculateFibonacci(indicator - 2) + calculateFibonacci(indicator - 1);
    }
}
