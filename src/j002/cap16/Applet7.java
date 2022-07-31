package j002.cap16;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;

//example 16.7
public class Applet7 extends Applet{
	AppletContext ac;
	URL u1;
	
	@Override
	public void init() {
		setBackground(Color.cyan);
	}
	
	@Override
	public void start() {
		ac = getAppletContext();
		u1 = getCodeBase();
		try {
			Thread.sleep(2000);
			ac.showDocument(new URL(u1 +"A.html"),"_blank");
		} catch (MalformedURLException e) {
			showStatus("Invalid URL");
			e.printStackTrace();
		}
		catch (InterruptedException e) {
			showStatus("Invalid URL");
			e.printStackTrace();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(u1+"A.html", 20, 20);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
