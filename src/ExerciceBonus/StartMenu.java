package ExerciceBonus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class StartMenu extends JPanel {

	public StartMenu() {

		JMenuItem cercleItem = new JMenuItem("Cercle", KeyEvent.VK_E);
		JMenuItem rectangleItem = new JMenuItem("Rectangle", KeyEvent.VK_E);
		JMenuItem triangleItem = new JMenuItem("Triangle", KeyEvent.VK_E);
		JMenu menu = new JMenu("formes");
		menu.add(cercleItem);
		menu.add(rectangleItem);
		menu.add(triangleItem);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(menu);
		this.add(menuBar);

		cercleItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ZoneDessin dessin = new ZoneDessin(new Cercle());
				dessin.setBackground(Color.WHITE);
				dessin.setPreferredSize(new Dimension(800, 800));
				GUIHelper.showOnFrame(dessin, "Cliquer Deux Fois pour indiquer le centre et le rayon");
			}
		});

		rectangleItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ZoneDessin dessin = new ZoneDessin(new Rectangle());
				dessin.setBackground(Color.WHITE);
				dessin.setPreferredSize(new Dimension(800, 800));
				GUIHelper.showOnFrame(dessin, "Cliquer Deux Fois pour indiquer le point départ et la distance");
			}
		});

		triangleItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ZoneDessin dessin = new ZoneDessin(new Triangle());
				dessin.setBackground(Color.WHITE);
				dessin.setPreferredSize(new Dimension(800, 800));
				GUIHelper.showOnFrame(dessin, "Cliquer Trois Fois Pour indiquer les trois points de triangle");
			}
		});

	}
}
