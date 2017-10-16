package flag;

import java.awt.Color;
import java.awt.Graphics;

public class RedPart {
	/**
	 * draws the red background of the flag
	 * @param g graphics
	 */
	public static void redStuff(Graphics g, double h) {
		g.setColor(Color.RED.darker());
		g.fillRect(0, 0, (int) h*19/10, (int) h);
	}
}
