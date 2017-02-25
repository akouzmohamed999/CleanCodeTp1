package ExerciceBonus;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Triangle extends JPanel {

	private final int x;
	private final int y;
	private final int distance1;
	private final int distance2;

	public Triangle() {
		this.x = 0;
		this.y = 0;
		this.distance1 = 0;
		this.distance2 = 0;
	}

	public Triangle(int x, int y, int distance1, int distance2) {
		super();
		this.x = x;
		this.y = y;
		this.distance1 = distance1;
		this.distance2 = distance2;
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillArc(this.x, this.y, this.distance1, this.distance2, 60, 60);
		g.setColor(c);
	}
}
