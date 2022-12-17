//PEWARISAN, IMPELEMENTS INTERFACE
public class Student extends Person implements printInfo{
	
	//ACCESS MODIFIER, PROPERTY,STATE,VARIABLE
	protected double GPA;
	protected String major;
	
	//CONSTRUCTOR overloading
	public Student(String id, String name,  double gPA, String major) {
		super(id, name);
		GPA = gPA;
		this.major = major;
	}
	
	//METHOD GETTER SETTER
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	//method final
	@Override
	public final void printInformation() {
		// TODO Auto-generated method stub
		System.out.printf("  | %6s | %20s | %20s  | %10f |\n",this.id,this.name,this.major,this.GPA);
	}
	
	
}
