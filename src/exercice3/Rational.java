package exercice3;

public class Rational extends Numeric {

	private final int numerator;
	private final int denominator;

	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;

		if (denominator == 0) {
			throw new ArithmeticException("Impossible de créer ce nombre rationnel");
		}
	}

	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	@Override
	public Numeric add(Numeric numeric) {
		return numeric.addRational(this);
	}

	@Override
	public Numeric multiply(Numeric numeric) {
		return numeric.multiplayRational(this);
	}

	@Override
	public Numeric substract(Numeric numeric) {

		return numeric.opposite().add(this);
	}

	@Override
	public Numeric div(Numeric numeric) {
		return numeric.inverse().multiply(this);
	}

	public int plusGrandCommunDenominateur(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
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

	public Rational reduce() {
		int pgcd = this.plusGrandCommunDenominateur(this.getDenominator(), this.getNumerator());
		int newNumerator = this.getNumerator() / pgcd;
		int newDenominator = this.getDenominator() / pgcd;
		if (0 > newDenominator) {
			newNumerator = newNumerator * -1;
			newDenominator = newDenominator * -1;
		}
		return new Rational(newNumerator, newDenominator);

	}

	@Override
	public Rational opposite() {
		return new Rational(this.numerator * -1, this.denominator);
	}

	@Override
	public Rational inverse() {

		if (this.numerator == 0) {
			throw new ArithmeticException("Impossible d'inverser Ce Nombre");
		}
		return new Rational(this.denominator, this.numerator);
	}

	@Override
	public String toString() {
		return String.valueOf(this.getNumerator() + "/" + this.getDenominator());
	}

	@Override
	public Numeric addRational(Rational rational) {
		int newDenominator = this.denominator * rational.denominator;
		int newNumerator1 = this.numerator * rational.getDenominator();
		int newNumerator2 = rational.getNumerator() * this.denominator;
		return new Rational(newNumerator1 + newNumerator2, newDenominator).reduce();
	}

	@Override
	public Numeric multiplayRational(Rational rational) {
		int newNumenator = this.numerator * rational.getNumerator();
		int newDenominator = this.denominator * rational.getDenominator();
		return new Rational(newNumenator, newDenominator).reduce();
	}

	@Override
	protected Numeric addReel(Reel reel) {
		return new Reel(reel.getValue() + this.numerator / this.denominator);
	}

	@Override
	protected Numeric multiplayReel(Reel reel) {
		return new Reel(reel.getValue() * this.numerator / this.denominator);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Rational other = (Rational) obj;
		if (this.denominator != other.denominator) {
			return false;
		}
		if (this.numerator != other.numerator) {
			return false;
		}
		return true;
	}

}
