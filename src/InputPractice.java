import java.util.Scanner;

public class InputPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pizzaChoice = 0;
		int count = 0;
		
		while ((pizzaChoice < 1 || pizzaChoice > 5) && count < 3) {
			System.out.println("What type of pizza do you want?");
			
			System.out.println("Enter 1 for cheese.");
			System.out.println("Enter 2 for pepperoni.");
			System.out.println("Enter 3 for pineapple."); 
			
			if (input.nextInt() >= 1 && input.nextInt() <= 3) {
				System.out.println("You choose pizza choice " + (pizzaChoice + 1) + ".");
			} else {
				System.out.println("That's not a choice!");
				count++;
			}
		}
		
		System.out.println("Goodbye!");
	}
}