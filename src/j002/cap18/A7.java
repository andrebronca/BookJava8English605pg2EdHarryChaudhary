package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//example 18.7
public class A7 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 300);
		Button b1 = new Button("Push me");
		b1.addMouseListener(new B7());
		b1.addMouseMotionListener(new C7());
		b1.addActionListener(new D7());
		f.add(b1);
		f.setVisible(true);
	}
}

class B7 implements MouseListener{

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse entered...");
		System.out.println(e.getX());
		System.out.println(e.getY());
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse exited...");
		Point p1 = e.getPoint();
		System.out.println(p1.x);
		System.out.println(p1.y);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse clicked...");
		System.out.println("Button: "+ e.getButton());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse pressed...");
		int ms = e.getModifiersEx();
		String s = e.getModifiersExText(ms);
		System.out.println(s);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse released...");
		System.out.println("Click count: "+ e.getClickCount());
	}
}

class C7 implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse moved...");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Mouse dragged...");
	}
}

class D7 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button pressed...");
	}
	
}