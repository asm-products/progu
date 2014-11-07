import java.util.Scanner; // Import Scanner from java.util package.

public class AreaInput {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Ask user to input radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		// Compute area
		double area = radius * radius * 3.14159;
		
		// Display results
		System.out.println("The area of the circle radius " +
			radius + " is " + area);
	}
}