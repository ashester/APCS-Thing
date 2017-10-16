package flag;

import java.awt.Color;
import java.awt.Graphics;

public class Star {
	/**
	 * draws a single white star
	 * @param g graphics
	 * @param midX x coordinate of star
	 * @param midY y coordinate of star
	 * @param width width of star
	 * @param height height of star
	 */
	public static void stars(Graphics g, int midX, int midY, int width, int height) {
		//creates array of radii
		int radius[] = {height*308/10000,height*154/10000,height*308/10000,height*154/10000};
		int nPoints = 10;
		int[] X = new int[nPoints];
		int[] Y = new int[nPoints];
		//star outline
		for (double current=0.0; current<nPoints; current++) {
			int i = (int) current;
			//calculates angles for star
			double x = Math.cos(current*((2*Math.PI)/10)+60)*radius[i % 4];
			double y = Math.sin(current*((2*Math.PI)/10)+60)*radius[i % 4];

			X[i] = (int) x+midX;
			Y[i] = (int) y+midY;
		}

		g.setColor(Color.WHITE); //sets color of star to white
		g.fillPolygon(X, Y, 10); //fills the star
	}
}
