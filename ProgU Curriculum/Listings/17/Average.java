import java.util.Scanner; // Import Scanner

public class Average {
	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		// Compute average
		double average = (number1 + number2 + number3) / 3;
		
		// Display result
		System.out.println("The average of " + number1 + " " + number2
			+ " " + number3 + " is " + average);
	}
}