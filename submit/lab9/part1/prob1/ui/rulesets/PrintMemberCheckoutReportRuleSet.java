package lab9.part1.prob1.ui.rulesets;

import javafx.stage.Stage;
import lab9.part1.prob1.ui.PrintMemberCheckoutReport;

final public class PrintMemberCheckoutReportRuleSet implements RuleSet {
	PrintMemberCheckoutReportRuleSet() {
	}

	@Override
	public void applyRules(Stage ob) throws RuleException {
		PrintMemberCheckoutReport searchLibraryMemberWindow = (PrintMemberCheckoutReport) ob;
		nonEmptyRule(searchLibraryMemberWindow.getMemberId());
	}

	private void nonEmptyRule(String memberID) throws RuleException {
		if (memberID.trim().isEmpty()) {
			throw new RuleException("Member id must be nonempty.");
		}
	}
}
