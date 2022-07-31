package j002.cap18;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//example 18.6
public class A6 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 300);
		f.addWindowListener(new B6());
		f.setVisible(true);
	}
}

class B6 extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Window Closing");
		Frame f = (Frame) e.getWindow();
		f.dispose();
	}
}