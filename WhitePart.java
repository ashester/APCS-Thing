package flag;

import java.awt.Color;
import java.awt.Graphics;

public class WhitePart {
	/**
	 * draws the 6 white stripes on the flag
	 * @param g graphics
	 */
	public static void whiteStripes(Graphics g, double h) {
		int count = 1;
		int newPos = 0;
		for(int i = 0; i<6; i++) {
			g.setColor(Color.WHITE);
			newPos = (int) (h/13)*count;
			g.fillRect(0, newPos, (int) h*19/10, (int) h/13);
			count=count+2;
		}
	}
}
