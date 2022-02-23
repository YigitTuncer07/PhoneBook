import java.util.Scanner;

public class Phone {

	private int myNumber;
	private static Scanner scanner = new Scanner(System.in);
	private static ContactBook contacts = new ContactBook();

	public Phone(int num) {
		this.myNumber = num;
	}

	public static void main(String[] args) {
		boolean quit = false;
		int c = 0;
		printInstructions();

		while (!quit) {
			System.out.println("");
			System.out.print("Enter your choice: ");
			System.out.println("");
			c = scanner.nextInt();
			switch (c) {
			case 1:
				printInstructions();
				break;
			case 2:
				contacts.addContact();
				break;
			case 3:
				contacts.removeContact();
				break;
			case 4:
				contacts.seeContacts();
				break;
			case 5:
				contacts.findContact();
				break;
			case 6:
				quit = true;
			}
		}

	}

	public static void printInstructions() {
		System.out.println("Press 1 to  see instructions.");
		System.out.println("Press 2 to add a contact.");
		System.out.println("Press 3 to remove a contact.");
		System.out.println("Press 4 to see all contacts.");
		System.out.println("Press 5 to find a contact.");
		System.out.println("Press 6 to quit.");

	}
}
