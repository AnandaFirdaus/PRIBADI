
public class Classroom implements printInfo {

	protected String roomId;
	protected Exam exam;
	protected String schedule;
	
	public Classroom(String roomId, Exam exam, String schedule) {
		super();
		this.roomId = roomId;
		this.exam = exam;
		this.schedule = schedule;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	//METHOD OVERRIDING
	@Override
	public void printInformation() {
		// TODO Auto-generated method stub
		System.out.printf("  | %6s | %20s | %20s  |\n",this.roomId,this.schedule,this.exam.examId);
	}
	
	
}
