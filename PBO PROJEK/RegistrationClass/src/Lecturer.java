
public class Lecturer extends Person implements printInfo {
	
	protected String department;
	protected int salary;
	
	public Lecturer(String id, String name, String department, int salary) {
		super(id, name);
		this.department = department;
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void printInformation() {
		// TODO Auto-generated method stub
		System.out.printf("  | %6s | %20s | %20s | %5s | %10d |\n",this.id,this.name,this.department,"",this.salary);
	}
	
	

}
