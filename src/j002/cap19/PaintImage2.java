package j002.cap19;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

//example 19.3
public class PaintImage2  extends Applet{
	private Image im;
	
	@Override
	public void init() {
		try {
			String file = "FILE://";
			String file_mac_os = file +"/Users/andrebronca/Downloads/saidavermelhanacaixa-removebg-preview.png";
			im = getImage(new URL(file_mac_os));
		} catch (MalformedURLException e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(im, 0, 0, this);
	}
}
