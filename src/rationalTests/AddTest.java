package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercice3.Rational;
import exercice3.Reel;

public class AddTest extends ARationalTest {

	@Test
	public void shouldReturn45WhenAdd35And15() {
		assertEquals(new Rational(4, 5), this.rational1Sur5.add(this.nombre2));
	}

	@Test
	public void shouldReturn25WhenAdd35AndOpposite15() {
		assertEquals(new Rational(2, 5), this.nombre2.add(this.rational1Sur5.opposite()));
	}

	@Test
	public void shouldReturnMinus25WhenAdd15andOpposite35() {
		assertEquals(new Rational(-2, 5), this.rational1Sur5.add(this.nombre2.opposite()));
	}

	@Test
	public void shouldReturn1600WhenAdd15To1580() {
		assertEquals(new Reel(16.00), this.rational1Sur5.add(this.nombreReel));
	}

	@Test
	public void shouldReturnMinus1560WhenAdd15ToOpposite1580() {

		assertEquals(new Reel(-15.600000000000001), this.rational1Sur5.add(this.nombreReel.opposite()));
	}

}