package flag;

import java.awt.Color;
import java.awt.Graphics;

public class Union {
	/**
	 * draws the blue union on the flag
	 * @param g graphics
	 */
	public static void union(Graphics g, double h) {
		g.setColor(Color.BLUE.darker().darker());
		g.fillRect(0, 0, (int) h*19/25, (int) h*7/13);
	}

}
