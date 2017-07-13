package lab9.part1.prob1.business;

import java.io.Serializable;

public class AddCopyBookException extends Exception implements Serializable {

	public AddCopyBookException() {
		super();
	}
	public AddCopyBookException(String msg) {
		super(msg);
	}
	public AddCopyBookException(Throwable t) {
		super(t);
	}
	private static final long serialVersionUID = 8978723266036027364L;
	
}
