package lab10.prob6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GuestListJava8 {

    public static void main(String[] args) {
        final boolean yes = true;
        final boolean no = false;
        GuestListJava8 gl = new GuestListJava8();
        List<Guest> invited
                = Arrays.asList(new Guest("Joe Stevens", Status.COMMON, Gender.M, 5, yes),
                new Guest("Susan Richards", Status.GOLD, Gender.F, 10, no),
                new Guest("Toni Smith", Status.COMMON, Gender.F, 4, yes),
                new Guest("Anthony Hawkins", Status.ILLEGAL, Gender.M, 0, yes),
                new Guest("Tony Thomas", Status.SILVER, Gender.M, 8, no),
                new Guest("Antoinette Cerisier", Status.SILVER, Gender.F, 7, yes),
                new Guest("Ricardo Salhuega", Status.COMMON, Gender.M, 2, yes));

        gl.printListOfExpectedFemaleGuests(invited);
//        gl.printListOfExpectedFemaleGuests1(invited);

    }

    private boolean checkLegal(Guest g) throws IllegalGuestException {
        boolean isIllegal = (g.getStatus() == Status.ILLEGAL);
        if (isIllegal) throw new IllegalGuestException(String.format(
                "Illegal guest %s has attempted entry to the event", g.getName()));
        else return true;
    }

    private boolean uncheckedLegal(Guest g) {
        try {
            return checkLegal(g);
        } catch (IllegalGuestException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    // Check exception in another function and convert to RuntimeException
    public void printListOfExpectedFemaleGuests(List<Guest> invited) {
        System.out.println(invited.stream().filter(guest -> uncheckedLegal(guest))
                .filter(guest -> guest.getGender() == Gender.F && guest.isPlanningToCome())
                .map(Guest::toString)
                .sorted().collect(Collectors.toList()));
    }

    // PredicateWithException.unchecked
    public void printListOfExpectedFemaleGuests1(List<Guest> invited) {
        System.out.println(invited.stream().filter(PredicateWithException.unchecked(guest -> checkLegal(guest)))
                .filter(guest -> guest.getGender() == Gender.F && guest.isPlanningToCome())
                .map(Guest::toString)
                .sorted().collect(Collectors.toList()));
    }


    class IllegalGuestException extends Exception {
        private static final long serialVersionUID = 1L;

        IllegalGuestException() {
            super("An illegal guest has attempted entry.");
        }

        IllegalGuestException(String msg) {
            super(msg);
        }

        IllegalGuestException(Throwable t) {
            super(t);
        }
    }
}
