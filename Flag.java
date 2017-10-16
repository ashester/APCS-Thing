package flag;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flag extends JPanel {
	private double hoist; //height of flag
	
	/**
	 * constructor for Flag
	 * @param hoist height of the flag
	 */
	public Flag (int hoist) {
		init();
		this.hoist = hoist;
	}

	public void init() {
		setSize(700,600);
		setBackground(Color.WHITE);
		repaint();
	}

	/**
	 * draws the entire flag
	 * @param g graphics
	 */
	public void paint(Graphics g) {
		hoist = super.getSize().getHeight();

		//red background
		RedPart.redStuff(g, hoist);

		//white stripes
		WhitePart.whiteStripes(g, hoist);

		//blue thing
		Union.union(g, hoist);

		//stars
		for(int j=2; j<=5;j++) { //four rows
			for(int i=0; i<11;i++) { 
				if(i%2==0) { //if row number is even, draw the six star part
					Star.stars(g, (int) hoist*63/1000 + (int) hoist*63*i/1000, (int) hoist*(54+108*(j-2))/1000,(int) hoist*19/10, (int) hoist);
				} else { //if row number is odd, draw the five star part
					Star.stars(g, (int) hoist*63/1000 + (int) hoist*63*i/1000, (int) hoist*(108+108*(j-2))/1000,(int) hoist*19/10, (int) hoist);
				}
			}
		}

		//last line
		for(int i=0; i<11;i++){
			if(i%2==0){
				//start of each row
				Star.stars(g, (int) hoist*63/1000+ (int) hoist*63*i/1000, (int) hoist*486/1000, (int) hoist*19/10, (int) hoist);
			}

		}
	} 

	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame flag = new JFrame("Yay Flag");
		flag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		flag.setBackground(Color.white);
		flag.setSize(700,400);
		Flag yay = new Flag(260); //creates the flag
		Container c = flag.getContentPane();
		c.add(yay);
		flag.setVisible(true); //sets it visible
		flag.setResizable(true); //can resize
	}
}	