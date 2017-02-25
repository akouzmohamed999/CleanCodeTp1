package rationalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercice3.Rational;
import exercice3.Reel;

public class DivMethodTest extends ARationalTest {

	@Test
	public void shouldReturn13WhenDiv15And35() {
		assertEquals(new Rational(1, 3), this.rational1Sur5.div(this.nombre2));
	}

	@Test
	public void shouldReturn31WhenDiv35And15() {
		assertEquals(new Rational(3, 1), this.nombre2.div(this.rational1Sur5));
	}

	@Test
	public void shouldReturnMinus13WhenDiv15AndMinus35() {
		assertEquals(new Rational(-1, 3), this.rational1Sur5.div(this.nombre2.opposite()));
	}

	@Test
	public void shouldReturnMinus31WhenDiv35AndMinus15() {
		assertEquals(new Rational(-3, 1), this.nombre2.div(this.rational1Sur5.opposite()));
	}

	@Test
	public void shouldReturn001WhenDiv15And1580() {
		assertEquals(new Reel(0.012658227848101264), this.rational1Sur5.div(this.nombreReel));
	}

	@Test
	public void shouldReturnMinus001WhenDiv1580And15() {
		assertEquals(new Reel(-0.012658227848101264), this.rational1Sur5.div(this.nombreReel.opposite()));
	}

}
