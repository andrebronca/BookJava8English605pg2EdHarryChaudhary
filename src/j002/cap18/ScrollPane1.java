package j002.cap18;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

//example 18.19
public class ScrollPane1 extends Applet {

	private static final long serialVersionUID = 1L;
	
	Image img1;
	URL file1;
	
	@Override
	public void init() {
		try {
			String file = "FILE://";
			String file_mac_os = file +"/Users/andrebronca/Downloads/saidavermelhanacaixa-removebg-preview.png";
			String file_win = file +"/c:/javaprg/a.jpg";
			file1 = new URL(file_mac_os);
		} catch (MalformedURLException e) {
			System.out.println(e);
		}
		img1 = getImage(file1);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img1, 0, 0, this);
	}

}
