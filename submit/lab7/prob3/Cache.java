package lab7.prob3;

public interface Cache {
	default long timeout() {
		//seconds
		return 1;
	}
}
