package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 18.1
public class A1 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(500, 100);
		Button b1 = new Button("Push me");
		Button b2 = new Button("Click me");
		b1.addActionListener(new B1());
		b2.addActionListener(new C1());
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
	}
}

class B1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Pushed");
	}
}

class C1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked");
	}
	
}