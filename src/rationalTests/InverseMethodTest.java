package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercice3.Rational;

public class InverseMethodTest extends ARationalTest {

	@Test
	public void shouldReturn53When35() {
		assertEquals(new Rational(5, 3), this.nombre2.inverse());
	}

	@Test
	public void shouldReturn35whenInverseInverse() {
		assertEquals(new Rational(3, 5), this.nombre2.inverse().inverse());
	}

	@Test(expected = ArithmeticException.class)
	public void shouldReturnExceptionWhenDenominatorIs0() {
		try {
			this.nombre3.inverse();
		} catch (Exception e) {
			assertEquals("Impossible d'inverser Ce Nombre", e.getMessage());
			throw e;
		}
	}
}
