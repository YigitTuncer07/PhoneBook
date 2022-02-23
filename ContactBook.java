import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {

	private static ArrayList<Contact> list = new ArrayList<Contact>();
	private static Scanner scanner = new Scanner(System.in);

	public void addContact() {
		System.out.print("Enter the name of the contact you want to add: ");
		String name = inputName();

		System.out.print("Enter the number of the contact: ");
		String number = inputNumber();

		list.add(new Contact(name, number));

		System.out.println(name + " has been added as a contact");

	}

	public void seeContacts() {
		System.out.println("You have " + list.size() + " contacts.");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("");
			Contact contact = list.get(i);
			System.out.println((i + 1) + ". " + contact.getName() + ": " + contact.getPhoneNumber());
		}
	}

	public void removeContact() {
		System.out.print("Enter the contact you want to remove: ");
		String name = inputName();
		Contact contact = findContact(name);
		if (list.indexOf(contact) == -1) {
			System.out.println("Contact does not exist");
		} else {
			list.remove(contact);
			System.out.println(name + " has been removed from contacts.");
		}

	}
	public void findContact() {
		System.out.print("Enter the name of the contact you want to find: ");
		String name = inputName();
		Contact contact = findContact(name);
		if (list.indexOf(contact) == -1) {
			System.out.println("Contact does not exist.");
		} else {
			System.out.println("The number of " + name + " is " + contact.getPhoneNumber());
		}
	}
	public Contact findContact(String name) {
		Contact contact = new Contact();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				contact = list.get(i);
			}
		}
		return contact;
	}

	public static String inputName() {
		String string = scanner.next();
		return string.substring(0, 1).toUpperCase() + string.substring(1, string.length()).toLowerCase();

	}

	public static String inputNumber() {
		boolean quit = false;
		String string = "";
		while (!quit) {
			string = scanner.next();
			if (string.length() != 10 && !(string.equals("1"))) {
				System.out.print("Number must be 10 digits long, enter again: ");
			} else if (string.equals("1")) {
				string = "5537123415";
				quit = true;
			} else {
				quit = true;
			}

		}
		return string;
	}
}
