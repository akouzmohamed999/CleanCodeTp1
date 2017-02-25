package exercice3;

import exercice2.Natural;

public class NumericTest {

	public static void main(String[] args) {

		Numeric rational1 = new Rational(3, 2);
		Numeric rational2 = new Rational(1, 4);

		Numeric reel1 = new Reel(1.50f);
		Numeric reel2 = new Reel(3.14f);

		Numeric natural1 = new Natural(5);
		Numeric natural2 = new Natural(4);

		System.out.println(rational1.add(reel1));
		System.out.println(reel1.add(rational1));
		System.out.println(rational1.add(natural1));
	}
}
