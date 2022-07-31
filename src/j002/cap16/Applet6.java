package j002.cap16;

import java.applet.Applet;
import java.awt.Graphics;
import java.net.URL;

//example 16.6
public class Applet6 extends Applet {
	@Override
	public void paint(Graphics g) {
		URL u1 = getCodeBase();
		g.drawString("Code base: "+ u1, 10, 20);
//		file:/Users/andrebronca/eclipse_workspace_ide/j002-IntroductionToJava8/bin/
		
		URL u2 = getDocumentBase();
		g.drawString("Document base: "+ u2, 10, 40);
//		file:/Users/andrebronca/eclipse_workspace_ide/j002-IntroductionToJava8/bin/j002.cap16.Applet6165838884989.html
	}
}
