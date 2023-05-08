package exceptions;

public class NotInRange extends RuntimeException {
	private int min;
	private int max;

	public NotInRange(String message, int min, int max) {
		super(message);
		this.min = min;
		this.max = max;
	}
}
