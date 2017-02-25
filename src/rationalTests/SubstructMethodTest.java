package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercice3.Rational;

public class SubstructMethodTest extends ARationalTest {

	@Test
	public void shouldReturnMinus25WhenSubs15And35() {
		assertEquals(new Rational(-2, 5), this.rational1Sur5.substract(this.nombre2));
	}

	@Test
	public void shouldReturn25WhenSubs35and15() {
		assertEquals(new Rational(2, 5), this.nombre2.substract(this.rational1Sur5));
	}

}
