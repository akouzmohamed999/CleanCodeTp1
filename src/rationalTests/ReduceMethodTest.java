package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercice3.Rational;

public class ReduceMethodTest extends ARationalTest {

	@Test
	public void shouldReturn25when1025() {
		assertEquals(new Rational(2, 5), new Rational(10, 25).reduce());
	}

	@Test
	public void shouldReturn25WhenMinus1025() {

		assertEquals(new Rational(-2, 5), new Rational(-10, 25).reduce());
	}

	@Test
	public void shouldReturnMinus15WhenMinus15() {
		assertEquals(new Rational(-1, 5), new Rational(3, -15).reduce());
	}

	@Test
	public void shouldReturn15WhenMinus3Minus15() {
		assertEquals(new Rational(1, 5), new Rational(-3, -15).reduce());
	}

	@Test
	public void shouldReturnTheSameWhen1327() {
		assertEquals(new Rational(13, 27), new Rational(13, 27).reduce());
	}

}
