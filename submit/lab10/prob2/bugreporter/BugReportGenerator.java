package lab10.prob2.bugreporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;

import lab10.prob2.classfinder.ClassFinder;
import lab10.prob2.bugreporter.BugReport;
import logging.defaultlogging.LogSetup;

/**
 * This class scans the package lab10.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG;
//	= Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lab10.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	
	static {
		LogSetup.setup();
		LOG = Logger.getGlobal();
	}
	public void reportGenerator() throws FileNotFoundException, IOException {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		HashMap<String, String> hash = new HashMap<>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				
				String name = annotation.assignedTo();
				int severity = annotation.severity();
				String description = annotation.description();
				String reportedBy = annotation.reportedBy();
				
				String newLine = System.lineSeparator();
				String value = new StringBuilder()
						.append("\t").append(REPORTED_BY).append(reportedBy).append(newLine)
						.append("\t").append(CLASS_NAME).append(cl).append(newLine)
						.append("\t").append(DESCRIPTION).append(description).append(newLine)
						.append("\t").append(SEVERITY).append(severity).append(newLine).append(newLine).toString();
				
				if (!hash.containsKey(name)) {
					hash.put(name, value);
				} else {
					String oldVal = hash.get(name);
					String newVal = oldVal + value;
					hash.put(name, newVal);
				}
				
			}
		}
//		System.out.println(names);
		
		
		try (PrintWriter printWriter = new PrintWriter(new FileWriter(REPORT_NAME))) {
			hash.keySet().forEach( key -> {
				printWriter.println(key);
				printWriter.println(hash.get(key));
			});
		} catch (FileNotFoundException e) {
			LOG.warning("Main exception: " + e.getMessage());
			List<Throwable> suppressed = Arrays.asList(e.getSuppressed());	
			suppressed.forEach(except -> LOG.warning("Suppressed message: " 
			                                         + except.getMessage()));
		} catch (IOException e) {
			LOG.warning("Main exception: " + e.getMessage());
			List<Throwable> suppressed = Arrays.asList(e.getSuppressed());	
			suppressed.forEach(except -> LOG.warning("Suppressed message: " 
			                                         + except.getMessage()));
		}
		
	}
	
	
}
