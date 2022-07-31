package j002.cap17;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;

//example 17.13
public class CanvasTest {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		Canvas c = new MyCanvas();
		c.setSize(100, 100);
		f.add(c);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}

class MyCanvas extends Canvas{

	private static final long serialVersionUID = 1L;
	
	@Override
	public void paint(Graphics g) {
		setBackground(Color.green);
		g.setColor(Color.red);
		g.drawLine(0, 0, 99, 99);
	}
}
