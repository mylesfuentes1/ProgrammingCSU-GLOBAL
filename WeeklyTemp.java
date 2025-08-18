import java.util.Scanner;
import java.util.ArrayList;


public class WeeklyTemp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Produce Days of the week//
		ArrayList<String> days = new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		//Set temperature listing 
		ArrayList<Double> temperatures = new ArrayList<>();
		
		System.out.println("Enter the average temperature for each day of the week:");
		
		//Organize temperatures for each day//
		for(String day : days) {
			System.out.print(day + ": ");
		    double temp = scanner.nextDouble();
		    temperatures.add(temp);
		}
		
		scanner.nextLine(); //Get rid of leftover lines//
		
		// Prompt user input//
		while (true) {
			System.out.println("\nEnter a day (Monday-Sunday) to see temperature, or type 'week' to see full weekly temperature. Type 'exit' to quit:");
			String input = scanner.nextLine().trim();
			
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("Exiting program...");
				break;
			}
			else if (input.equalsIgnoreCase("week")) {
				double sum = 0;
				System.out.println("\nWeekly Temperatures:");
				for (int i = 0; i < days.size(); i++) {
					System.out.println(days.get(i) + ": " + temperatures.get(i) + "C");
					sum += temperatures.get(i);
				}
				double average = sum / days.size();
				System.out.println("Weekly Average Temperature: " + String.format("%.2f", average) + "C");
			}
			else {
				boolean found = false;
				for (int i = 0; i < days.size(); i++) {
					if (days.get(i).equalsIgnoreCase(input)) {
						System.out.println(days.get(i) + ": " + temperatures.get(i) + "C");
						found = true;
						break;
						
					}
				}
				if (!found) {
					System.out.println("Invalid input. Please enter a valide day (Monday-Sunday), 'week', or 'exit' .");
				}
			}
		}

	}

}
