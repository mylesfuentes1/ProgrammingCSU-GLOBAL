import java.util.Scanner;

public class Infinityloop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//setting positive and negative infinity will negate these numbers canceling each-other out//
		double total = 0;
		double max = Double.NEGATIVE_INFINITY;
		double min = Double.POSITIVE_INFINITY;
        int count = 0;
		
        System.out.println("Enter 5 Floating-point values:");
        
        // This will prompt the user to enter their value//
        while (count < 5) {
        	System.out.print("Enter value #" + (count + 1) + ": ");
        	
        	if (scanner.hasNextDouble()) {
        		double value = scanner.nextDouble();
        		total += value;
        		
        		if (value > max) {
        			max = value;
        		}
        		if (value < min) {
        			min = value;
        		}
        		// this prevents an infinite loop//
        		count++; 
        	} else {
        		System.out.println("Invalid input. Enter valid floating-point number.");
        		scanner.next();
        	}
        }	
        // This will divide the 5 floating points providing the average, then multiplying will provide the 20% interest value//
        double average = total / 5;
        double interest = total * 0.20;
        
       System.out.println("\nResults:");
       System.out.println("Total: " + total);
       System.out.println("Average: " + average);
       System.out.println("Maximum: " + max);
       System.out.println("Minimum: " + min);
       System.out.println("Interest on total at 20%: " + interest);
      

	}



}
