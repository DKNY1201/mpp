package prob1.factory;

import java.awt.Component;

import prob1.launch.RuleSet;
import prob1.windows.AddrWindow;

final public class AddressRuleSet implements RuleSet{
	
	AddressRuleSet(){};
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow)ob;
		addressRule(addr);
	}
	
	private void addressRule(AddrWindow addr) throws RuleException{
		String addressId = addr.getIdValue();
		String street = addr.getStreetValue();
		String city = addr.getCityValue();
		String state = addr.getStateValue();
		String zip = addr.getZipValue();
		
		try {
			if (addressId.length() == 0 || zip.length() == 0 || street.length() == 0 || city.length() == 0 || state.length() == 0)
				throw new RuleException("All fields must be nonempty");
			
			Integer.parseInt(addressId);
			Integer.parseInt(zip);
			
			if (zip.length() != 5)
				throw new RuleException("Zip must be exactly 5 digits");
			if (!state.matches("[a-zA-z]+") || state.length() != 2)
				throw new RuleException("State must have exactly two characters in the range A-Z");
			if (addressId.equals(zip))
				throw new RuleException("ID field may not equal zip field");
		} catch (NumberFormatException e){
			throw new RuleException("ID and Zip field must be numeric");
		}
	}

}
