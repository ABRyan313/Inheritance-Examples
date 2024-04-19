package employee;

public class Engineer extends Employee{
	
	private String project;
	
	public Engineer(String name, double salary, String project) {
		super(name, salary);
		this.project = project;
	}
	
	public String getProject() {
		return project;
	}
	
	public void setProject(String project) {
		this.project = project;
	}

}
