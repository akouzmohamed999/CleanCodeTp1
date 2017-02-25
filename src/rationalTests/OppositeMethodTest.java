package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercice3.Rational;

public class OppositeMethodTest extends ARationalTest {

	@Test
	public void shouldReturnMinus35When35() {
		assertEquals(new Rational(-3, 5), this.nombre2.opposite());
	}

	@Test
	public void shouldReturn35WhenMinus35() {
		assertEquals(new Rational(3, 5), this.nombre2.opposite().opposite());
	}
}
