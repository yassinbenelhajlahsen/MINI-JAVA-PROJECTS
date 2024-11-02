import java.util.Scanner;

public class Calculator {

    static int add(int var1, int var2) {
        return var1 + var2;
    }

    static int subtract(int var1, int var2) {
        return var1 - var2;
    }

    static int multiply(int var1, int var2) {
        return var1 * var2;
    }

    static double divide(int var1, int var2) {
        if (var2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return (double) var1 / var2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hi, press the number that corresponds to your operation.");

        while (true) {
            String[] operations = {"Quit", "Addition", "Subtraction", "Multiplication", "Division"};

            for (int i = 0; i < operations.length; i++) {
                System.out.println(i + " for " + operations[i]);
            }

            int userOperation = input.nextInt();

            if (userOperation == 0) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter both numbers, separated by a space: ");
            int var1 = input.nextInt();
            int var2 = input.nextInt();

            switch (userOperation) {
                case 1:
                    System.out.println("The result is: " + add(var1, var2));
                    break;
                case 2:
                    System.out.println("The result is: " + subtract(var1, var2));
                    break;
                case 3:
                    System.out.println("The result is: " + multiply(var1, var2));
                    break;
                case 4:
                    double divisionResult = divide(var1, var2);
                    if (!Double.isNaN(divisionResult)) {
                        System.out.println("The result is: " + divisionResult);
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
            System.out.println();
        }
    }
}
