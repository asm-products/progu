public class Area {
	public static void main(String[] args) {
		double radius; // Declare radius.
		double area; // Declare area.
		
		// 1. Get circle radius.
		radius = 10;
		
		// 2. Area = radius * radius * PI
		area = radius * radius * 3.14159;
		
		// 3. Display result.
		System.out.println("The area of the circle " +
		"radius " + radius + " is: " + area);
	}
}