package exercice3;

public abstract class Numeric {

	public abstract Numeric add(Numeric numeric);

	protected abstract Numeric addRational(Rational rational);

	protected abstract Numeric addReel(Reel reel);

	public abstract Numeric substract(Numeric numeric);

	public abstract Numeric multiply(Numeric numeric);

	protected abstract Numeric multiplayRational(Rational rational);

	protected abstract Numeric multiplayReel(Reel reel);

	public abstract Numeric div(Numeric numeric);

	protected abstract Numeric opposite();

	protected abstract Numeric inverse();
}
