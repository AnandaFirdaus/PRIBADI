import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

	Scanner scan = new Scanner(System.in);
	//Praktek yang menunjukkan enkapsulasi dengan private di kelas main
	private Random rand = new Random();
	//Praktek yang menunjukkan enkapsulasi dengan protected di kelas main
	protected ArrayList<Student> students = new ArrayList<>();
	protected ArrayList<Lecturer> lecturers = new ArrayList<>();
	protected ArrayList<Subject> subjects = new ArrayList<>();
	protected ArrayList<Class> classes = new ArrayList<>();
	protected ArrayList<Exam> exams = new ArrayList<>();
	protected ArrayList<Classroom> classrooms = new ArrayList<>();
	
	//Instansiasi dengan menggunakan dua jenis konstruktor di kelas main
	public Main() {
		
		menu();
		cls();
		System.out.println("Thankyou!");
		scan.nextLine();
	}
	public void cls(){
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}
	private void menu() {
		
		int choice = 0;
		do {
			cls();
			System.out.println("Choose menu:");
			System.out.println("1. Input Data");
			System.out.println("2. Show Data");
			System.out.println("3. Exit");
			do {
				System.out.print(">> ");
				try {
					choice = scan.nextInt();
				} catch (Exception e) {
					choice = 0;
				}
			}while (choice <1 || choice >3);
			cls();
			switch (choice) {
				case 1:
					inputData();
					break;
				case 2:
					showData();
					break;
				default:
					break;
			}
		}while (choice!= 3);
	}
	
	private void inputData() {
		
		int choice = -1;
		do {
			cls();
			System.out.println("Choose data you want to input");
			System.out.println("1. Student");
			System.out.println("2. Lecturer");
			System.out.println("3. Subject");
			System.out.println("4. Class");
			System.out.println("5. Exam");
			System.out.println("6. Classroom");
			System.out.println("0. Exit");
			do {
				System.out.print(">>");
				try {
					choice = scan.nextInt();
				} catch (Exception e) {
					choice = -1;
				}
			}while (choice < 0 || choice > 6);
			scan.nextLine();
			switch (choice) {
				case 1: 
					inputStudent();
					break;
				case 2: 
					inputLecturer();
					break;
				case 3: 
					inputSubject();
					break;
				case 4:
					inputClass();
					break;
				case 5:
					inputExam();
					break;
				case 6:
					inputClassroom();
					break;
				default:
					break;
			}
			scan.nextLine();
		}while(choice != 0);
	}
	
	
	//METHOD DENGAN PARAMETER
	private String generateCode(String type) {
		String code;
		if(type.equals("student")) code= "ST-";
		else if(type.equals("lecturer")) code= "LT-";
		else if(type.equals("class")) code= "CL-";
		else if(type.equals("exam")) code= "EX-";
		else if(type.equals("subject")) code= "SB-";
		else code= "CR-";
		
		for (int i = 0; i < 10; i++) {
			code += random(8, 9);
		}
		
		return code;
	}
	//METHOD NON BOOLEAN PROPERTY
	private int random(int min, int max) {
		int bound = max - min + 1;
		int numeric = rand.nextInt(bound) + min;
		return numeric;
	}
	private void inputStudent() {
		// TODO Auto-generated method stub
		cls();
		String name ="",major="",id="";
		double gpa=0.0;
		do {
			System.out.print("Input student name [min length 5]: ");
			name = scan.nextLine();
		}while(name.length()<5);
		
		do {
			System.out.print("Input student major [min length 5]: ");
			major = scan.nextLine();
		}while(major.length()<5);
		do {
			System.out.print("Input student gpa [1.00 - 4.00]: ");
			gpa = scan.nextDouble();
		}while(gpa<1.00 || gpa>4.00);
		id = generateCode("student");
		
		students.add(new Student(id,name,gpa,major));
		System.out.println("Success add student!");
		scan.nextLine();
		
	}
	
	private void inputLecturer() {
		// TODO Auto-generated method stub
		cls();
		String name ="",depart="",id="";
		int salary = 0;
		do {
			System.out.print("Input lecturer name [min length 5]: ");
			name = scan.nextLine();
		}while(name.length()<5);
		
		do {
			System.out.print("Input lecturer department [min length 5]: ");
			depart = scan.nextLine();
		}while(depart.length()<5);
		do {
			System.out.print("Input lecturer salary [1000000 - 5000000]: ");
			salary = scan.nextInt();
		}while(salary<1000000 || salary>5000000);
		id = generateCode("lecturer");
		
		lecturers.add(new Lecturer(id,name,depart,salary));
		System.out.println("Success add lecturer!");
		scan.nextLine();
		
	}
	
	private void inputSubject() {
		// TODO Auto-generated method stub
		cls();
		String id="",name="";
		int sks = 0;
		do {
			System.out.print("Input subject name [min length 5]: ");
			name = scan.nextLine();
		}while(name.length()<5);
		do {
			System.out.print("Input subject sks [2-8]: ");
			sks = scan.nextInt();
		}while(sks<2 || sks>8);
		id = generateCode("subject");
		
		subjects.add(new Subject(id,name,sks));
		System.out.println("Success add subject!");
		scan.nextLine();
	}
	
	private void inputClass() {
		// TODO Auto-generated method stub
		cls();
		int num = 0;
		int idx = 0;
		String id = generateCode("class");
		ArrayList<Student> studentList = new ArrayList<>();
		
		if (subjects.isEmpty() || students.isEmpty() || lecturers.isEmpty()) {
			System.out.println("Input data student/subject/lecturer first!");
			scan.nextLine();
			return;
		}
		
		
		
		do {
			System.out.print("Input number student [1-"+students.size()+"]: ");
			try {
				num = scan.nextInt();
			} catch (Exception e) {
				num = 0;
			}
		}while(num<1 || num> students.size());
		
		showStudent();
		
		for (int i = 0 ; i < num ; i++) {
			do {
				System.out.print("Input no student [1-"+students.size()+"]: ");
				try {
					idx = scan.nextInt();
				} catch (Exception e) {
					idx = 0;
				}
			}while (idx<1 || idx> students.size());
			
			studentList.add(students.get(idx-1));
		}
		
		showLecturer();
		
		idx = 0;
		do {
			System.out.print("Input no lecturer [1-"+lecturers.size()+"]: ");
			try {
				idx = scan.nextInt();
			} catch (Exception e) {
				idx = 0;
			}
		}while (idx<1 || idx> lecturers.size());
		
		Lecturer lec = lecturers.get(idx-1);
		
		showSubject();
		
		idx = 0;
		do {
			System.out.print("Input no subject [1-"+subjects.size()+"]: ");
			try {
				idx = scan.nextInt();
			} catch (Exception e) {
				idx = 0;
			}
			scan.nextLine();
		}while (idx<1 || idx> subjects.size());
		
		Subject subject = subjects.get(idx-1);
		
		classes.add(new Class(id,subject,lec,studentList));
		
		System.out.println("Success add class!");
		scan.nextLine();
		
	}
	
	private void inputExam() {
		// TODO Auto-generated method stub
		cls();
		int idx = 0;String name ="";
		if (classes.isEmpty()) {
			System.out.println("Input data class first!");
			return;
		}
		showClass();
		
		do {
			System.out.print("Input no class [1-"+classes.size()+"]: ");
			try {
				idx = scan.nextInt();
			} catch (Exception e) {
				idx = 0;
			}
			scan.nextLine();
		}while (idx<1 || idx> classes.size());
		
		Class class_ = classes.get(idx-1);
		do {
			System.out.print("Input exam name [min length 5]: ");
			name = scan.nextLine();
		}while(name.length()<5);
		
		String id = generateCode("exam");
		exams.add(new Exam(id,name,class_));
		
		System.out.println("Success add exam!");
		scan.nextLine();
	}
	
	private void inputClassroom() {
		// TODO Auto-generated method stub
		cls();
		int idx=0; String date="";
		if (exams.isEmpty()) {
			System.out.println("Input data exam first!");
			return;
		}
		
		showExam();
		
		do {
			System.out.print("Input no exam [1-"+exams.size()+"]: ");
			try {
				idx = scan.nextInt();
			} catch (Exception e) {
				idx = 0;
			}
		}while (idx<1 || idx> exams.size());
		
		Exam exam = exams.get(idx-1);
		
		do {
			System.out.print("Input schedule [ex. 12/Des/2022]: ");
			try {
				date = scan.next("[0-9]{1,2}/[a-zA-Z]{3}/[0-9]{4}");
			} catch (Exception e) {
				// TODO: handle exception
				date = "";
			}
			scan.nextLine();
		}while (date.length()==0);
		String id = generateCode("classroom");
		classrooms.add(new Classroom(id, exam, date));
		System.out.println("Success add classroom!");
		scan.nextLine();
	}
	
	private void showData() {
		
		int choice = -1;
		do {
			cls();
			System.out.println("Choose data you want to show");
			System.out.println("1. Student");
			System.out.println("2. Lecturer");
			System.out.println("3. Subject");
			System.out.println("4. Class");
			System.out.println("5. Exam");
			System.out.println("6. Classroom");
			System.out.println("0. Exit");
			do {
				System.out.print(">>");
				try {
					choice = scan.nextInt();
				} catch (Exception e) {
					choice = -1;
				}
			}while (choice < 0 || choice > 6);
			scan.nextLine();
			switch (choice) {
				case 1: 
					showStudent();
					break;
				case 2: 
					showLecturer();
					break;
				case 3: 
					showSubject();
					break;
				case 4:
					showClass();
					break;
				case 5:
					showExam();
					break;
				case 6:
					showClassroom();
					break;
				default:
					break;
			}
			scan.nextLine();
		}while(choice != 0);
	}
	
	private void showStudent() {
		// TODO Auto-generated method stub
		
		if (students.isEmpty()) {
			System.out.println("Student data empty!");
			return;
		}
		for (int i = 0 ; i < students.size() ; i++) {
			System.out.print(i+1); students.get(i).printInformation();
		}
	}
	private void showLecturer() {
		// TODO Auto-generated method stub
		if (lecturers.isEmpty()) {
			System.out.println("Lecturer data empty!");
			return;
		}
		for (int i = 0 ; i < lecturers.size() ; i++) {
			System.out.print(i+1); lecturers.get(i).printInformation();
		}
	}
	private void showSubject() {
		// TODO Auto-generated method stub
		if (subjects.isEmpty()) {
			System.out.println("Subject data empty!");
			return;
		}
		for (int i = 0 ; i < subjects.size() ; i++) {
			System.out.print(i+1); subjects.get(i).printInformation();
		}
	}
	private void showClass() {
		// TODO Auto-generated method stub
		if (classes.isEmpty()) {
			System.out.println("Class data empty!");
			return;
		}
		for (int i = 0 ; i < classes.size() ; i++) {
			System.out.print(i+1); classes.get(i).printInformation();
		}
	}
	
	private void showExam() {
		// TODO Auto-generated method stub
		if (exams.isEmpty()) {
			System.out.println("Exam data empty!");
			return;
		}
		for (int i = 0 ; i < exams.size() ; i++) {
			System.out.print(i+1); exams.get(i).printInformation();
		}
	}
	
	private void showClassroom() {
		// TODO Auto-generated method stub
		if (classrooms.isEmpty()) {
			System.out.println("Classroom data empty!");
			return;
		}
		for (int i = 0 ; i < classrooms.size() ; i++) {
			System.out.print(i+1); classrooms.get(i).printInformation();
		}
	}
	
	//METHOD STATIC
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
