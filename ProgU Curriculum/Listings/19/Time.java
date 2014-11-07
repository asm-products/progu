import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Get user input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60; // Find minutes from seconds.
		int remainingSeconds = seconds % 60; // Remainder seconds.
		System.out.println(seconds + " seconds is " + minutes + 
			" minutes and " + remainingSeconds + " seconds.");
	}
}