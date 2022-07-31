package j002.cap17;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

//example 17.1
public class MyFrame1 {
	public static void main(String[] args) {
		Frame f = new Frame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Label l1 = new Label("Name: ");
		f.add(l1);
		TextField tf1 = new TextField("Matrix");
		f.add(tf1);
		tf1.setBackground(Color.green);
		tf1.setForeground(Color.red);
		Button b1 = new Button("ok");
		Font f1 = new Font("Arial", Font.BOLD, 24);
		b1.setFont(f1);
		f.add(b1);
		f.setSize(500,100);
		f.setVisible(true);
	}
}
