package exercice2;


public class test {

	public static void main(String[] args) {
		
		Natural tree = new Natural(3);
		Natural four = new Natural(4);
		
		System.out.println(" 4 + 3 = "+four.add(tree));
		System.out.println(" 4 - 3 = "+four.substract(tree));
		System.out.println(" 4 * 3 = "+four.multiply(tree));
		System.out.println(" 4 / 3 = "+four.div(tree));

	}

}
