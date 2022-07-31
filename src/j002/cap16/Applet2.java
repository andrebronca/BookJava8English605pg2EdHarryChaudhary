package j002.cap16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//example 16.2
public class Applet2 extends Applet{
	String msg = "";
	
	@Override
	public void init() {
		System.out.println("Inside init");
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg = "Inside init() ---";
	}
	
	@Override
	public void start() {
		System.out.println("Inside start");
		msg += "Inside start() ---";
	}
	
	@Override
	public void stop() {
		System.out.println("Inside stop");
		msg += "Inside stop() ---";
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println("Inside paint");
		msg += "Inside paint() ---";
		g.drawString(msg, 10, 30);
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside destroy");
	}
}
