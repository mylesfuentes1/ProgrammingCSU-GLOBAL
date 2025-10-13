import java.util.Scanner;

public class RecursiveProduct {

    // Recursive method to calculate the product of numbers in an array
    public static int findProduct(int[] numbers, int index) {
        // Base case: when we reach the last element
        if (index == numbers.length - 1)
            return numbers[index];

        // Recursive case: multiply current number by product of remaining numbers
        return numbers[index] * findProduct(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int product = findProduct(numbers, 0);
        System.out.println("The product of all five numbers is: " + product);

        input.close();
    }
}
