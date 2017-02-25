package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PgcdMethodTest extends ARationalTest {

	@Test
	public void shouldReturnAWhenBEquals0() {
		int a = 10;
		assertEquals(a, this.rational1Sur5.plusGrandCommunDenominateur(a, 0));
	}

	@Test
	public void shouldReturnBWhenAEquals0() {
		int b = 10;
		assertEquals(b, this.rational1Sur5.plusGrandCommunDenominateur(0, b));
	}

	@Test
	public void shouldReturn5When10And25() {
		assertEquals(5, this.rational1Sur5.plusGrandCommunDenominateur(10, 25));
	}

	@Test
	public void shouldReturn5whenMinus10And25() {
		assertEquals(5, this.rational1Sur5.plusGrandCommunDenominateur(-10, 25));
	}

	@Test
	public void shouldReturn5When25And10() {
		assertEquals(5, this.rational1Sur5.plusGrandCommunDenominateur(25, 10));
	}

	@Test
	public void shouldReturn5WhenMinus25And10() {
		assertEquals(5, this.rational1Sur5.plusGrandCommunDenominateur(-25, 10));
	}
}
