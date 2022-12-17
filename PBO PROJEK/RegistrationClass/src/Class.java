import java.util.ArrayList;

public class Class implements printInfo  {

	protected String classId;
	protected Subject subject;
	protected Lecturer lecturer;
	protected ArrayList<Student> studentList;
	
	
	public Class(String classId, Subject subject, Lecturer lecturer, ArrayList<Student> studentList) {
		super();
		this.classId = classId;
		this.subject = subject;
		this.lecturer = lecturer;
		this.studentList = studentList;
	}
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	//METHOD OVERRIDING
	@Override
	public void printInformation() {
		// TODO Auto-generated method stub
		System.out.printf("  | %6s | %20s | %20s |\n",this.classId,this.subject.subjectName,this.lecturer.name);
	}
	
	
	
	
}
