package rationalTests;

import java.text.DecimalFormat;

import org.junit.Before;

import exercice3.Rational;
import exercice3.Reel;

public abstract class ARationalTest {

	protected Rational rational1Sur5;
	Rational nombre2;
	Rational nombre3;
	Reel nombreReel;
	DecimalFormat decimalFormat;

	@Before
	public void setUp() {

		this.rational1Sur5 = new Rational(1, 5);
		this.nombre2 = new Rational(3, 5);
		this.nombre3 = new Rational(0, 5);
		this.nombreReel = new Reel(15.80);
		this.decimalFormat = new DecimalFormat("##.##");
	}

}
