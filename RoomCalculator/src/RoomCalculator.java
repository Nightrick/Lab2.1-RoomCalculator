import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String continueDecision;	
		String volumeDecision;
		
		System.out.println("Hello and welcome to the Grand Circus Room Calculator!");
		System.out.println("\n");
		
		do {		
			System.out.print("Enter Length: ");
			double length = scanner.nextDouble();
			System.out.print("Enter Width: ");
			double width = scanner.nextDouble();
			System.out.println("Area: " + length * width);
			System.out.println("Perimeter: " + 2 * (length + width));
			System.out.println("\n"); 
			System.out.print("Would you like to determine the volume of the room also? (y/n): ");
			volumeDecision = scanner.next().toLowerCase();
			System.out.println("\n");
				if(volumeDecision.equals("y")){
					System.out.print("Enter Height: ");
					double height = scanner.nextDouble();
					System.out.println("Volume: " + (length * width * height));
				}
			System.out.print("Would you like to continue with a new room? (y/n): ");
			continueDecision = scanner.next().toLowerCase();
			System.out.println("\n");
		} while (continueDecision.equals("y"));
		
		System.out.println("Thank you! Have a nice day!");
		System.exit(0);
		
	}
}
		
		
		
	