package lab;

public class Student extends Person {
	private String facultyNumber;

	public Student(String fName, String lName, String fNumber) {
		super(fName, lName);
		setFacultyNumber(fNumber);
	}
	
	public void display() {
		System.out.println("Student : ");
		System.out.println("First Name : " + getFirstName());
		System.out.println("Last Name : " + getLastName());
		System.out.println("Faculty Number : " + getFacultyNumber());
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		if (facultyNumber.length()<5 || facultyNumber.length()>10 ) {
 		System.out.println("Faculty number must have 5 to 10 "
 				+ "alpharithmetic characters ");
 		System.exit(0);
		}
		if (!facultyNumber.matches("[A-Za-z0-9]+")){
			System.out.println("Faculty number must have be "
	 				+ "alpharithmetic characters ");
	 		System.exit(0);
		}
		this.facultyNumber = facultyNumber;
		
		
	}

}
