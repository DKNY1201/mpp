package prob1.factory;

import java.awt.Component;
import java.util.HashMap;

import prob1.launch.RuleSet;
import prob1.windows.AddrWindow;
import prob1.windows.ProfileWindow;

final public class RuleSetFactory {
	private RuleSetFactory(){};
	
	static HashMap<Class<? extends Component>, RuleSet> map  = new HashMap<>();
	
	static{
		map.put(AddrWindow.class, new AddressRuleSet());
		map.put(ProfileWindow.class, new CustomerProfileRuleSet());
	}
	
	public static RuleSet getRuleSet(Component c){
		Class<? extends Component> cl = c.getClass();
		if (!map.containsKey(cl)){
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
	
}
