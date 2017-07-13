package lab9.part1.prob1.business;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import lab9.part1.prob1.dataaccess.DataAccess;
import lab9.part1.prob1.dataaccess.DataAccessFacade;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingOverdueBook());
		System.out.println(allHavingMultipleAuthors());

	}

	// Returns a list of all ids of LibraryMembers whose zipcode contains the
	// digit 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);

		return mems.stream()
				.filter(mem -> mem.getAddress().getZip().indexOf("3") >= 0)
				.map(LibraryMember::getMemberId)
				.collect(Collectors.toList());

	}

	// Returns a list of all ids of LibraryMembers that have an overdue book
	public static List<String> allHavingOverdueBook() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);

		return mems.stream()
				.filter(mem -> {
					List<CheckoutRecordEntry> entries = mem.getCheckoutRecord().getCheckoutRecordEntries();
					for (CheckoutRecordEntry entry : entries) {
						if (entry.getDueDate().isBefore(LocalDate.now())) {
							return true;
						}
					}
					return false;
				})
				.map(LibraryMember::getMemberId)
				.collect(Collectors.toList());
	}

	// Returns a list of all isbns of Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		return bs.stream()
				.filter(b -> b.getAuthors().size() > 1)
				.map(Book::getIsbn)
				.collect(Collectors.toList());
	}

}
