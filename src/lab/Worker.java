package lab;

import java.text.DecimalFormat;

public class Worker extends Person {
	private double weekSalary;
	private int hoursPday;
	private static int workers = 0;
	
	public Worker(String fName, String lName, double wSalary, int hPday) {
		super(fName, lName);
		workers = workers + 1;
		setWeekSalary(wSalary);
		setHoursPday(hPday);
	}

	public double CalSalPerHour(double wSalary, int hPday) {
		double salPhour;
		salPhour = (wSalary / 5) / hPday;
		return salPhour;
	}

	public void display() {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println("Worker " + getWorkers() + " : ");
		System.out.println("First Name : " + getFirstName());
		System.out.println("Last Name : " + getLastName());
		System.out.println("Week Salary : " + df.format(getWeekSalary()));
		System.out.println("Hours Per Day : " + getHoursPday());
		System.out.println("Salary per hour : " + 
				 df.format(CalSalPerHour(getWeekSalary(), getHoursPday())));

	}

	public static int getWorkers() {
		return workers;
	}

	public static void setWorkers(int workers) {
		Worker.workers = workers;
	}

	public double getWeekSalary() {
		return weekSalary;
	}

	public void setWeekSalary(double weekSalary) {
		if (weekSalary<10){
			System.out.println("Week salary must be more than 10");
			System.exit(0);
		}
		this.weekSalary = weekSalary;
	}

	public int getHoursPday() {
		return hoursPday;
	}

	public void setHoursPday(int hoursPday) {
		if(hoursPday<1 || hoursPday>12) {
			System.out.println("Working hours must be in range 1-12");
			System.exit(0);
		}
		this.hoursPday = hoursPday;
	}

}
