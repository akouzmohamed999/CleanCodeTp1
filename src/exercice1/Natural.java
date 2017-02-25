package exercice1;

public class Natural {

	private final int value;

	public Natural(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public Natural add(Natural natural) {

		return new Natural(this.value + natural.getValue());
	}

	public Natural multiply(Natural natural) {

		return new Natural(this.getValue() * natural.getValue());

	}

	public Natural substract(Natural natural) {

		return new Natural(this.getValue() - natural.getValue());
	}

	public Natural divide(Natural natural) {

		if (natural.getValue() == 0) {
			throw new ArithmeticException("Division sur 0 est impossible");
		}
		return new Natural(this.getValue() / natural.getValue());
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
