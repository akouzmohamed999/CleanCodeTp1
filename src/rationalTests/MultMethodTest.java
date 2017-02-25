package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercice3.Rational;
import exercice3.Reel;

public class MultMethodTest extends ARationalTest {

	@Test
	public void shouldReturn325WhenMult15And35() {
		assertEquals(new Rational(3, 25), this.rational1Sur5.multiply(this.nombre2));
	}

	@Test
	public void shouldReturn325WhenMult35And15() {
		assertEquals(new Rational(3, 25), this.nombre2.multiply(this.rational1Sur5));
	}

	@Test
	public void shouldReturnReel316WhenMult15And1580() {
		assertEquals(new Reel(3.16), this.rational1Sur5.multiply(this.nombreReel));
	}

	@Test
	public void shouldReturnReelMinus316WhenMult15AndOpposite1580() {
		assertEquals(new Reel(-3.16), this.rational1Sur5.multiply(this.nombreReel.opposite()));
	}

}
