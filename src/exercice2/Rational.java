package exercice2;

public class Rational {

	private final int numerator;
	private final int denominator;

	public Rational(int numerator, int denominator) {

		if (denominator == 0) {
			throw new ArithmeticException("Impossible de créer ce nombre rationnel");
		}

		this.numerator = numerator;
		this.denominator = denominator;

	}

	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public Rational add(Rational rational) {

		int newDenominator = this.plusPetitMultiCommun(this.getDenominator(), rational.getDenominator());
		int newNumerator1 = this.getNumerator() * (newDenominator / this.getDenominator());
		int newNumerator2 = rational.getNumerator() * (newDenominator / rational.getDenominator());
		return new Rational(newNumerator1 + newNumerator2, newDenominator).reduce();
	}

	public Rational multiply(Rational rational) {
		int newNumerator = this.getNumerator() * rational.getNumerator();
		int newDenominator = this.getDenominator() * rational.getDenominator();
		return new Rational(newNumerator, newDenominator).reduce();
	}

	public int plusGrandCommunDenominateur(int a, int b) {
		if (b == 0) {
			return a;
		} else if (a == 0) {
			return b;
		} else if (a >= b) {
			return this.plusGrandCommunDenominateur(b, a % b);
		} else {
			return this.plusGrandCommunDenominateur(a, b % a);
		}
	}

	public int plusPetitMultiCommun(int a, int b) {
		return a * b / this.plusGrandCommunDenominateur(a, b);
	}

	public Rational reduce() {

		int pgcd = this.plusGrandCommunDenominateur(this.getDenominator(), this.getNumerator());
		return new Rational(this.getNumerator() / pgcd, this.getDenominator() / pgcd);
	}

	public Rational opposite() {
		return new Rational(this.numerator * -1, this.denominator);
	}

	public Rational substract(Rational rational) {

		return this.add(rational.opposite());
	}

	public Rational inverse() {

		if (this.numerator == 0) {
			throw new ArithmeticException("Impossible d'inverser Ce Nombre");
		}
		return new Rational(this.getDenominator(), this.getNumerator());
	}

	public Rational div(Rational rational) {
		return this.multiply(rational.inverse());
	}

	@Override
	public String toString() {
		return String.valueOf(this.getNumerator() + "/" + this.getDenominator());
	}

}
