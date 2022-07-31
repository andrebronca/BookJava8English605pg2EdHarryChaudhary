package j002.cap16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Applet1 extends Applet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() {
		setBackground(Color.red);
		setForeground(Color.green);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("Hello Worlds", 20, 20);
	}

}
