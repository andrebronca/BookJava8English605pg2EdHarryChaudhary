package j002.cap17;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

//example 17.12
public class ButtonTest {
	public static void main(String[] args) {
		Frame f = new Frame("Testing Button Component");
		f.setLayout(new FlowLayout());
		Font f1 = new Font("Arial", Font.BOLD, 40);
		Color c1 = new Color(255,0,0);
		Color c2 = new Color(0,255,0);
		Button b1 = new Button();
		Button b2 = new Button("Cancel");
		b1.setForeground(c1);
		b2.setForeground(c1);
		b1.setBackground(c2);
		b2.setBackground(c2);
		b1.setFont(f1);
		b2.setFont(f1);
		b1.setLabel("Ok");
		System.out.println(b2.getLabel());
		f.add(b1);
		f.add(b2);
		f.setSize(500, 200);
		f.setVisible(true);
	}
}
