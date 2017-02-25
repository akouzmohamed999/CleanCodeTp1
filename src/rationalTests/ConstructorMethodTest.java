package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercice3.Rational;

public class ConstructorMethodTest extends ARationalTest {

	@Test(expected = ArithmeticException.class)
	public void shouldReturnExceptionWhenDenominatorIs0() {
		try {
			new Rational(5, 0);
		} catch (Exception e) {
			assertEquals("Impossible de créer ce nombre rationnel", e.getMessage());
			throw e;
		}
	}
}
