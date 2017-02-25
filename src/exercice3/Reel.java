package exercice3;

public class Reel extends Numeric {

	private final double value;

	public Reel(double d) {
		this.value = d;
	}

	public double getValue() {
		return this.value;
	}

	@Override
	public Numeric add(Numeric numeric) {
		return numeric.addReel(this);
	}

	@Override
	public Numeric substract(Numeric numeric) {
		return numeric.opposite().add(this);
	}

	@Override
	public Numeric multiply(Numeric numeric) {
		return numeric.multiplayReel(this);
	}

	@Override
	public Numeric div(Numeric numeric) {
		return numeric.inverse().multiply(this);
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

	@Override
	public Numeric addRational(Rational rational) {
		return new Reel(this.getValue() + this.getDoubleFromRationnal(rational));
	}

	@Override
	public Numeric multiplayRational(Rational rational) {
		return new Reel(this.getValue() * this.getDoubleFromRationnal(rational));
	}

	private double getDoubleFromRationnal(Rational rational) {
		return rational.getNumerator() * 1.0 / rational.getDenominator();
	}

	@Override
	protected Numeric addReel(Reel reel) {
		return new Reel(this.value + reel.getValue());
	}

	@Override
	protected Numeric multiplayReel(Reel reel) {
		return new Reel(reel.value * this.value);
	}

	@Override
	public Numeric opposite() {
		return new Reel(this.value * -1.0);
	}

	@Override
	public Numeric inverse() {
		return new Reel(1 / this.value);
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
		Reel other = (Reel) obj;
		if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		return true;
	}

}
