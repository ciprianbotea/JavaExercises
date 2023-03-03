package classes;

public class Employee extends Person{
	
	private double hourSalary;
	private int workedHours;
	
	public Employee(String name, double hourSalary, int workedHours) {
		super(name);
		this.hourSalary = hourSalary;
		this.workedHours = workedHours;
	}
	
	public Employee(double hourSalary, int workedHours) {
		super();
		this.hourSalary = hourSalary;
		this.workedHours = workedHours;
	}

	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	public double getHourSalary() {
		return hourSalary;
	}
	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}	
	
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
	
	public double calculate() {
		
		double salary = 0;
		
		if (this.hourSalary < 8) {
			this.hourSalary = 8;
		}
		
		if (this.workedHours > 0) {			
			if (this.workedHours <= 40) {
				salary = this.hourSalary * this.workedHours;
			}
			
			else {
				salary = this.hourSalary * this.workedHours * 1.1;
			}
		}
		
		return salary;
		
	}

	@Override
	public String toString() {
		return "Employee [Hourly salary=" + hourSalary + 
				", Worked hours=" + workedHours + 
				", Name=" + getName() + "]";
	}

}