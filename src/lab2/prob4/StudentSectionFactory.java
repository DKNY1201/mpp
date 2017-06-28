package prob4;

public class StudentSectionFactory {
	public static Section createSection (int secNum, String courseName){
		if (courseName == null) throw new IllegalArgumentException("Course name can not be null");
		Section sec = new Section(secNum, courseName);
		return sec;
	}
	
	public static Student createStudent (String id, String name){
		if (id == null || name == null) throw new IllegalArgumentException("Name and Id can not be null");
		Student student = new Student(id, name);
		return student;
	}
	
	public static void newTranscriptEntry(Student s, Section sect, String grade){
		s.grades.add(new TranscriptEntry(s, sect, grade));
		sect.gradeSheet.add(new TranscriptEntry(s, sect, grade));
	}
}
