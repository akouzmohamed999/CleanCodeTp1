package ExerciceBonus;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Cercle extends JPanel {

	private final int x;
	private final int y;
	private final int rayon;

	public Cercle(int x, int y, int rayon) {
		super();
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}

	public Cercle() {

		this.x = 0;
		this.y = 0;
		this.rayon = 0;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillOval(this.x + this.rayon, this.y + this.rayon, this.rayon, this.rayon);
	}
}
