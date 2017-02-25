package reelTests;

import org.junit.Before;

import exercice3.Reel;

public abstract class AReelClassTest {

	Reel nombre1;
	Reel nombre2;
	Reel nombre3;

	@Before
	public void setUp() {
		this.nombre1 = new Reel(10.50);
		this.nombre2 = new Reel(7.50);
		this.nombre3 = new Reel(-15.20);
	}
}
