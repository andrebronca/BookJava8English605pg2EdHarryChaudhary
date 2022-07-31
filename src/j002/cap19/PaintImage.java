package j002.cap19;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

//example 19.2
public class PaintImage extends Applet{
	private Image im;
	
	@Override
	public void init() {
		im = createImage(100, 50);
		Graphics imgc = im.getGraphics();
		imgc.setColor(Color.gray);
		imgc.fillRect(0, 0, 100, 50);
		imgc.setColor(Color.black);
		imgc.fillOval(0, 0, 50, 50);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(im, 10, 10, this);
	}
}
