package ExerciceBonus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class ZoneDessin extends JPanel {

	public ZoneDessin(Object object) {
		this.addMouseListener(new MouseAdapter() {

			int nbrPoints = 0;
			int x = 0;
			int y = 0;
			int x2 = 0;
			int y2 = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + "," + e.getY());
				this.nbrPoints++;
				if (this.nbrPoints == 1) {
					this.x = e.getX();
					this.y = e.getY();
				}
				if (this.nbrPoints == 2) {

					this.x2 = e.getX();
					this.y2 = e.getY();
				}

				if (object instanceof Cercle) {
					if (this.nbrPoints == 2) {
						int distance = (int) Math.sqrt(Math.pow(this.x - e.getX(), 2) + Math.pow(this.y - e.getY(), 2));
						Cercle cercle = new Cercle(this.x, this.y, distance);
						cercle.setBackground(Color.WHITE);
						cercle.setPreferredSize(new Dimension(800, 800));
						GUIHelper.showOnFrame(cercle, "Formes");
					}

				} else if (object instanceof Rectangle) {
					if (this.nbrPoints == 2) {
						int distance = (int) Math.sqrt(Math.pow(this.x - e.getX(), 2) + Math.pow(this.y - e.getY(), 2));
						Rectangle rectangle = new Rectangle(this.x, this.y, distance);
						rectangle.setBackground(Color.WHITE);
						rectangle.setPreferredSize(new Dimension(800, 800));
						GUIHelper.showOnFrame(rectangle, "Formes");
					}
				} else {
					if (this.nbrPoints == 3) {
						int distance1 = (int) Math
								.sqrt(Math.pow(this.x - e.getX(), 2) + Math.pow(this.y - e.getY(), 2));
						int distance2 = (int) Math.sqrt(Math.pow(this.x - this.x2, 2) + Math.pow(this.y - this.y2, 2));
						Triangle triangle = new Triangle(this.x, this.y, distance1, distance2);
						triangle.setBackground(Color.WHITE);
						triangle.setPreferredSize(new Dimension(800, 800));
						GUIHelper.showOnFrame(triangle, "Formes");
					}
				}

			}
		});
	}

}
