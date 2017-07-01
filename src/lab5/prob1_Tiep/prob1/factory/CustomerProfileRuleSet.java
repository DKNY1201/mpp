package prob1.factory;

import java.awt.Component;

import prob1.launch.RuleSet;
import prob1.windows.ProfileWindow;

final public class CustomerProfileRuleSet implements RuleSet{
	CustomerProfileRuleSet(){};
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow addr = (ProfileWindow)ob;
		customerProfileRule(addr);
	}
	
	private void customerProfileRule(ProfileWindow profile) throws RuleException{
		String addressId = profile.getIdValue();
		String favoriteRestaurant = profile.getFavoriteRestaurantValue();
		String favoriteMovie = profile.getFavoriteMovieValue();
		String firstName = profile.getFirstNameValue();
		String lastName = profile.getLastNameValue();
		
		try {
			if (addressId.length() == 0 || favoriteRestaurant.length() == 0 || favoriteMovie.length() == 0 || firstName.length() == 0 || lastName.length() == 0)
				throw new RuleException("All fields must be nonempty");
			
			Integer.parseInt(addressId);
			
			if (favoriteMovie.equals(favoriteRestaurant))
				throw new RuleException("Favorite restaurant cannot equal favorite movie");
			if (!firstName.matches("[a-zA-Z]+") || !lastName.matches("[a-zA-Z]+"))
				throw new RuleException("Firstname and Lastname fields may not contain spaces or characters other than a-z, A-Z.");
		} catch (NumberFormatException e){
			throw new RuleException("ID field must be numeric");
		}
	}
}
