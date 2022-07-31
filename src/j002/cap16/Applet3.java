package j002.cap16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//example 16.3
public class Applet3 extends Applet implements Runnable{
	String msg = "A simple moving banner";
	Thread t = null;
	boolean stopFlag;
	
	@Override
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	
	@Override
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	@Override
	public void stop() {
		stopFlag = true;
		t = null;
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 50, 30);
	}
	
	@Override
	public void run() {
		for(;;) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			msg = msg.substring(1) + msg.charAt(0);
			
			if(stopFlag) {
				break;
			}
		}
	}

}
