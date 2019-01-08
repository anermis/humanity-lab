package lab;

public class MainLab {
	
	public static void main(String[] args) {
		Student teen = new Student("nikolaos" , "chatzipanagiotis" ,
				"1234ab");
		teen.display();		
		
		System.out.println();
		
		Worker poor = new Worker("nikos" , "aggelos" ,
				10.1256 ,12);
		poor.display();
		
		System.out.println();
		
		Worker rich = new Worker("nikolas" , "chatzi" , 
				423.1256 ,8);
		rich.display();
	}

}
