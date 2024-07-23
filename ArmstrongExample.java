package assess;

import java.util.Scanner;

public class ArmstrongExample {

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digitCount = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Method to check Armstrong and throw exception
    public static void checkArmstrong(int number) {
        if (isArmstrong(number)) {
            throw new RuntimeException(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        try {
            checkArmstrong(number);
        } catch (RuntimeException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

