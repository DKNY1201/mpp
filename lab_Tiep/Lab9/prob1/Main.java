package prob1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

/***Prob1 Lab9
 * 
 * @author Tiep
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());
		System.out.println(allHavingOverdueBook());
	}

	// Returns a list of all ids of LibraryMembers whose zipcode contains the
	// digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		// implement
		List<String> memberIdList = mems.stream()
										.filter(m -> m.getAddress().getZip().indexOf('3') >= 0)
										.map(m -> m.getMemberId())
										.collect(Collectors.toList());
		return memberIdList;
	}

	// Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		// implement
		List<String> listHavingAtLeastTwoCopies = bs.stream()
													.filter(b -> b.getCopyNums().size() >= 2)
													.map(b -> b.getIsbn())
													.collect(Collectors.toList());
		return listHavingAtLeastTwoCopies;
	}

	// Returns a list of all isbns of Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		// implement
		List<String> listHavingMultipleAuthors = bs.stream()
													.filter(b -> b.getAuthors().size() > 1)
													.map(b -> b.getIsbn())
													.collect(Collectors.toList());
		return listHavingMultipleAuthors;

	}

	// Returns a list of all isbns of BookCopy that have overdue book
	public static List<String> allHavingOverdueBook() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);
		// implement
		LocalDate yesterdayDate = LocalDate.now().minusDays(1);
		List<String> listHavingOverdueBook = mems.stream()
												 .filter(mem -> mem.getCheckoutRecord()
												   			       .getCheckoutRecordEntries()
												   			       .size() > 0)
												 .filter(mem -> mem.getCheckoutRecord()
											   			           .getCheckoutRecordEntries()
											   			           .stream().allMatch(c -> yesterdayDate.compareTo(c.getDueDate()) <= 0 &&
											   			    		   				       !c.getBookCopy().isAvailable()))
												 .map(mem -> mem.getCheckoutRecord()
											   			        .getCheckoutRecordEntries()
											   			        .iterator().next()
											   			                   .getBookCopy()
											   			                   .getBook()
											   			                   .getIsbn())
												 .collect(Collectors.toList());
		return listHavingOverdueBook;
	}

}
