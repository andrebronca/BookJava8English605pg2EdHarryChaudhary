package j002.cap18;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//example 18.5
public class A5 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 300);
		f.addWindowListener(new B5());
		f.setVisible(true);
	}
}

class B5 implements WindowListener{
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		Frame f = (Frame) e.getWindow();
		f.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}
}
