package lab2.prob2A;

public class GradeReport {
	private String grade;
	private Student student;
	
	public void postGrade(String grade) {
		this.grade = grade;
	}
	
	GradeReport(Student student){
		this.student = student;
	}
	
	@Override
	public String toString(){
		return grade == null ? student.getName() + ": N/A" : student.getName() + ": " + grade;
	}
}
