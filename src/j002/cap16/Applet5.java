package j002.cap16;

import java.applet.Applet;
import java.awt.Font;
/*
<applet code="Applet5" width=500 height=100>
<param name="fontName" value="Arial">
<param name="fontSize" value="30">
</applet>
 */
import java.awt.Graphics;

//example 16.5
public class Applet5 extends Applet {
	String fName;
	String fSize;
	
	
	@Override
	public void init() {
		int fSizeI = 12;
		fName = getParameter("fontName");
		fSize = getParameter("fontSize");
		if (fName == null) {
			fName = "Courier";
		}
		if (fSize == null) {
			fSize = ""+ fSizeI;
		}
		fSizeI = Integer.parseInt(fSize);
		Font f1 = new Font(fName, Font.PLAIN, fSizeI);
		setFont(f1);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("Font name: "+ fName, 0, 25);
		g.drawString("Font size: "+ fSize, 0, 50);
		g.drawString("Hello world", 0, 75);
	}
}
