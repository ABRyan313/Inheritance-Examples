package employee;

public class Manager extends Employee {
	
	double bonus;
	
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

public double getBonus() {
		
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	public double getTotalSalary() {
		
		return getSalary() + bonus;
		
	}

	
	
	
	

}
