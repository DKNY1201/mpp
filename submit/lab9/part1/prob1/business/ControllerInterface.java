package lab9.part1.prob1.business;

import java.util.List;

import lab9.part1.prob1.ui.CheckOverdueBookWindow.OverdueRecord;
import lab9.part1.prob1.ui.CheckoutRecordWindow.CheckoutRecordAndLibraryMember;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	public List<Author> getAllAuthors();
	public LibraryMember searchMember(String memberID);
	public void addMember(String id, String firstName, String lastName, String street,
                          String city, String state, String zip, String phone) throws AddMemberException;
	public void editMember(String id, String firstName, String lastName, String street,
                           String city, String state, String zip, String phone);
	public void checkoutBook(String memberID, String isbnNumber) throws CheckoutBookException;
	public void addCopyBook(String isbn) throws AddCopyBookException;
	public void addBook(String isbn, String title, int maxCheckoutLength, int numOfCopies, List<Author> authors) throws AddBookException;
	public List<LibraryMember> getAllMembers();
	public List<Book> getAllBooks();
	public List<CheckoutRecordAndLibraryMember> getAllCheckoutRecordEntryAndLibraryMember();
	public List<OverdueRecord> getOverdueRecordByISBN(String isbn);
}
