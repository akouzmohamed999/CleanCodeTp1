package exercice2;

public class Exercice2Test {

	public static void main(String[] args) {

		Rational r1 = new Rational(0, 2);
		Rational r2 = new Rational(2, 6);

		System.out.println("Addition " + r1.add(r2));
		System.out.println("Soustraction " + r1.substract(r2));
		System.out.println("Multiplication " + r1.multiply(r2));
		System.out.println("Divsion " + r2.div(r1));
	}

}
