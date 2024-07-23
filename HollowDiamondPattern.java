package assess;

import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();
        
        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number for better diamond shape.");
           
        }
        
        int midRow = rows / 2 + 1;
        
        // Upper part of diamond
        for (int i = 1; i <= midRow; i++) {
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        // Lower part of diamond
        for (int i = midRow - 1; i >= 1; i--) {
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
