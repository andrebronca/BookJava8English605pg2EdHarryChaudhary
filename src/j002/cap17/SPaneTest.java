package j002.cap17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.TextArea;

//example 17.21
public class SPaneTest {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new GridLayout(1, 2));
		f.setSize(250, 150);
		ScrollPane spane = new ScrollPane();
		spane.setBackground(Color.green);
		f.add(spane);
		f.add(new TextArea());
		Button b1 = new Button("Push Me!");
		b1.setFont(new Font("Serif", Font.ITALIC, 100));
		spane.add(b1);
		f.setVisible(true);
	}
}
