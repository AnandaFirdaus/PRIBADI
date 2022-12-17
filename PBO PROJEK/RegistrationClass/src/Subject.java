
public class Subject implements printInfo {
	protected String subjectId;
	protected String subjectName;
	protected int sks;
	
	public Subject(String subjectId, String subjectName, int sks) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.sks = sks;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSks() {
		return sks;
	}
	public void setSks(int sks) {
		this.sks = sks;
	}
	//overloading dan overriding dgn perubahan access modifier
	@Override
	public void printInformation() {
		// TODO Auto-generated method stub
		System.out.printf("  | %6s | %20s | %20d  |\n",this.subjectId,this.subjectName,this.sks);
	}
	
	

}
