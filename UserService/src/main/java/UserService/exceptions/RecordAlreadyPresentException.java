package UserService.exceptions;

public class RecordAlreadyPresentException extends RuntimeException {
	public RecordAlreadyPresentException(String s) {
		super(s);
	}
}
