package prob4;

import java.util.*;

public class Student {
	String id;
	String name;
	List<TranscriptEntry> grades;
	
	Student(String id, String name){
		this.id = id;
		this.name = name;
		grades = new ArrayList<TranscriptEntry>();
	}
	public void addTranscriptEntry(TranscriptEntry transcriptEntry){
		grades.add(transcriptEntry);
	}
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
	}
	
	public List<String> getCourseList(){
		List<String> result = new ArrayList<String>();
		grades.forEach(grade -> result.add(grade.section.courseName));
		return result;
	}
	
	@Override
	public String toString() {
		return id + " - " + name;
	}
}
