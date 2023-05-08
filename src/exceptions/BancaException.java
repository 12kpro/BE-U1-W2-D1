package exceptions;

public class BancaException extends Exception {
	String message;

	public BancaException(String m) {
		super(m);
		this.message = m;
	}

	@Override
	public String toString() {
		return this.message;
	}

}
