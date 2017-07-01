package prob1.launch;

import java.awt.Component;

import prob1.factory.RuleException;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
