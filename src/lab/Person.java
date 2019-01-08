package lab;

public class Person {
	private String lastName;
	private String firstName;

	public Person(String fName, String lName) {
		setFirstName(fName);
		setLastName(lName);
	}

	public Person() {

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName.length()<4) {
			System.out.println("Name must start with capital and"
					+ " be more than 2 symbols");
			System.exit(0);
		}
		String cap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		this.lastName = cap;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName.length()<3) {
			System.out.println("Name must start with capital and"
					+ " be more than 2 symbols");
			System.exit(0);
		}
		String cap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		this.firstName = cap;
	}

}
