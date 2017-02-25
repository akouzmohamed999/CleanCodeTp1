package ExerciceBonus;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Rectangle extends JPanel {

	private final int x;
	private final int y;
	private final int distance;

	public Rectangle(int x, int y, int distance) {
		super();
		this.x = x;
		this.y = y;
		this.distance = distance;
	}

	public Rectangle() {
		this.x = 0;
		this.y = 0;
		this.distance = 0;
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillRect(this.x, this.y, this.distance, this.distance);
	}
}
