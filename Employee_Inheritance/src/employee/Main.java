package employee;

public class Main {

	public static void main(String[] args) {
		
		Manager m = new Manager("DK", 20000, 2000);
		System.out.println("Manager:");
		System.out.println(m.getName());
		System.out.println(m.getSalary());
		System.out.println(m.getBonus());
		System.out.println("Total salary:" +m.getTotalSalary());
		
		
		Engineer e = new Engineer("AB", 30000, "Train Tracker");
		System.out.println("\nEngineer:");
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getProject());
		
		SalesPerson s = new SalesPerson("Sobuj", 10000, 20);
		System.out.println("\nSales person:");
		System.out.println(s.getName());
		System.out.println(s.getSalary());
		System.out.println(s.getTarget());
		
		
		
		
		

	}

}
