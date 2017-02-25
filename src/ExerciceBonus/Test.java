package ExerciceBonus;

import java.awt.Color;
import java.awt.Dimension;

public class Test {

	public static void main(String[] args) {

		StartMenu startMenu = new StartMenu();
		startMenu.setBackground(Color.WHITE);
		startMenu.setPreferredSize(new Dimension(400, 200));
		GUIHelper.showOnFrame(startMenu, "Formes");

	}

}
