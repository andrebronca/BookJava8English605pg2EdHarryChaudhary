package j002.cap16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//example 16.4
public class Applet4 extends Applet{
	private void ini() {
		setBackground(Color.cyan);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("This is in the applet windows", 10, 20);
		showStatus("This is shown in the status window");
	}
}
