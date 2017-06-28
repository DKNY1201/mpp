package prob4;
import java.util.*;

/** Shows how the design in this package of classes
 *  allows you to navigate in the way that the class
 *  diagram suggests
 */
public class Main {	
	public static void main(String[] args) { 
		Student s1 = StudentSectionFactory.createStudent("001", "Tiep");
		Student s2 = StudentSectionFactory.createStudent("002", "Quy");
		Student s3 = StudentSectionFactory.createStudent("003", "Van");
		Section sec1 = StudentSectionFactory.createSection(309, "FPP");
		Section sec2 = StudentSectionFactory.createSection(409, "MPP");
		Section sec3 = StudentSectionFactory.createSection(501, "Big Data");
		StudentSectionFactory.newTranscriptEntry(s1, sec1, "A-");
		StudentSectionFactory.newTranscriptEntry(s1, sec2, "A+");
		StudentSectionFactory.newTranscriptEntry(s1, sec3, "A");
		StudentSectionFactory.newTranscriptEntry(s2, sec1, "A+");
		StudentSectionFactory.newTranscriptEntry(s2, sec2, "A+");
		StudentSectionFactory.newTranscriptEntry(s2, sec3, "A");
		StudentSectionFactory.newTranscriptEntry(s3, sec1, "B-");
		StudentSectionFactory.newTranscriptEntry(s3, sec2, "B+");
		StudentSectionFactory.newTranscriptEntry(s3, sec3, "B");
		System.out.println(s1.getTranscript());
		System.out.println(s2.getTranscript());
		System.out.println(s3.getTranscript());
		System.out.println(sec1.getGradeList());
		System.out.println(sec2.getGradeList());
		System.out.println(sec3.getGradeList());
		System.out.println(s1.getCourseList());
		System.out.println(s2.getCourseList());
		System.out.println(s3.getCourseList());
		System.out.println(sec1.getStudentListByGrade("A"));
		System.out.println(sec2.getStudentListByGrade("A"));
		System.out.println(sec3.getStudentListByGrade("A"));
	}
}
