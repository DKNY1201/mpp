package prob4;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
    List<TranscriptEntry> gradeSheet;
	
	Section (int secNum, String courseName){
		this.courseName = courseName;
		this.sectionNumber = secNum;
		gradeSheet = new ArrayList<TranscriptEntry>();
	}
	
	public void addTranscriptEntry(TranscriptEntry transcriptEntry){
		gradeSheet.add(transcriptEntry);
	}
	
	public List<String> getGradeList(){
		List<String> result = new ArrayList<String>();
		gradeSheet.forEach(grade -> result.add(grade.grade));
		return result;
	}
	
	public List<Student> getStudentListByGrade(String grade){
		List<Student> result = new ArrayList<Student>();
		for (TranscriptEntry entry : gradeSheet) {
			if (entry.grade.equals(grade)){
				result.add(entry.student);
			}
		}
		return result;
	}
}
