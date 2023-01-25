package Class;

public class Students {
	int studentID; //학번
	String studentName; 
	int grade; //학년
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println(studentName+","+address);
	}
	
	public static void main(String[] args) {
		Students student = new Students();
		student.studentName="한현승";
		
		System.out.println(student.studentName);
		System.out.println(student.getStudentName());
	}
}
