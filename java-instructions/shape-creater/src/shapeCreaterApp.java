import ui.console.Console;

public class shapeCreaterApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Shape Creater App\n");
		System.out.println("Create a rectangle!\n");
		
		int length = Console.getInt("Enter Length: ");
		int width = Console.getInt("Enter Width: ");
		System.out.println();
		
		for(int i=0; i<width; i++) {
			for(int j=0; j<length; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		System.out.println("\nByeee!");
	}
}
