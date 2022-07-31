package j002.cap18;

import java.awt.Dialog;
import java.awt.Frame;

//example 18.15
public class DialogTest {
	public static void main(String[] args) throws InterruptedException {
		Frame f1 = new Frame();
		f1.setSize(300, 300);
		f1.setVisible(true);
		Dialog d1 = new Dialog(f1);
		d1.setSize(100, 100);
		d1.setVisible(true);
		Thread.sleep(3000);
		d1.dispose();
	}
}
