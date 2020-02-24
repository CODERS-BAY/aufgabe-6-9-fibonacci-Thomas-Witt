import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("On which position do you want your fibonacci number?");
        int digit = scanner.nextInt();


        System.out.println(calculateFibonacci(digit));

    }

    private static Integer calculateFibonacci(Integer newFibonacci) {
        if (newFibonacci == 0) {
            return 0;
        } else if (newFibonacci == 1) {
            return 1;
        }
        return calculateFibonacci(newFibonacci - 1) + calculateFibonacci(newFibonacci - 2);


    }

}
