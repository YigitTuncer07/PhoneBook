
public class Contact {

	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public Contact(String phoneNumber) {
		this("Untitled", phoneNumber);
	}

	public Contact() {
		this("Unknown", "1112223334");
	}
	
	public String getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	

}
