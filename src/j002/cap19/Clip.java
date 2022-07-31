package j002.cap19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

//example 19.4
public class Clip extends Frame {
	public static void main(String[] args) {
		Frame f = new Clip();
		f.setSize(300, 330);
		f.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setClip(50, 80, 200, 200);
		for(int i = 0; i < 300; i += 100) {
			for(int j = 30; j < 330; j += 100) {
				g.fillOval(j, j, 100, 100);
			}
		}
		g.setColor(Color.green);
		g.drawString("Hello", 50, 50);
		g.drawString("Bye", 120, 150);
	}
}
