package j002.cap17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

//example 17.8
public class MyFrame8 extends Frame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Frame f = new MyFrame8();
//		f.setLayout(new BorderLayout());
		f.add(new Button("N"), BorderLayout.NORTH);
		f.add(new Button("S"), BorderLayout.SOUTH);
		f.add(new Button("E"), BorderLayout.EAST);
		f.add(new Button("W"), BorderLayout.WEST);
		
		Panel p = new Panel();
		p.setBackground(Color.green);
		f.add(p, BorderLayout.CENTER);
//		f.add(p); //default is center
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
