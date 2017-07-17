package lab10.prob2.bugreporter;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		BugReportGenerator brg = new BugReportGenerator();
		try {
			brg.reportGenerator();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
