
public class Exam implements printInfo{

	protected String examId;
	protected String examName;
	protected Class class_;
	
	public Exam(String examId, String examName, Class class_) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.class_ = class_;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public Class getClass_() {
		return class_;
	}

	public void setClass_(Class class_) {
		this.class_ = class_;
	}

	@Override
	public void printInformation() {
		// TODO Auto-generated method stub
		System.out.printf("  | %6s | %20s | %20s |\n",this.examId,this.examName,this.class_.classId);
	}
	
	
}
