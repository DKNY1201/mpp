package prob3;

public interface Cache {
	default long timeout() {
		//seconds
		return 1;
	}
}
