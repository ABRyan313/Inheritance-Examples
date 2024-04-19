package employee;

public class SalesPerson extends Employee{
	
	int target;
	
	public SalesPerson(String name, double salary, int target) {
		super(name, salary);
		this.target = target;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	
	
	

}
