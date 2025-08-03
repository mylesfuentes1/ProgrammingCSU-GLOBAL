import java.util.Scanner;

public class WeeklyTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Weekly income code
        System.out.print("Enter your weekly income: $");
        double income = scanner.nextDouble();
        double taxRate;
        double taxAmount;

        // This code will show the tax rate and what bracket a customer would fall under
        if (income < 500) {
            taxRate = 0.10;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // Calculated amount of tax
        taxAmount = income * taxRate;

        // Results 
        System.out.printf("weekly income of $%.2f,tax withholding is $%.2f (%.0f%%).\n",
                income, taxAmount, taxRate * 100);

        scanner.close();
    }
}
