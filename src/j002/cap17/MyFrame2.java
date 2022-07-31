package j002.cap17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

//example 17.2
public class MyFrame2 extends Frame {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		System.out.println(f.paramString());
		
		Label l1 = new Label("Name: ");
		f.add(l1);
		
		TextField tf1 = new TextField("Sample Program");
		f.add(tf1);
		tf1.setBackground(Color.GREEN);
		tf1.setForeground(Color.RED);
		
		Button b1 = new Button("ok");
		b1.setFont(new Font("Serif", Font.BOLD, 24));
//		b1.setEnabled(false);
		Dimension d = b1.getSize();
		System.out.println("Button Size: "+ d.width +" "+ d.height);
		f.add(b1);
//		f.setResizable(false);
//		f.setUndecorated(true);
		f.setVisible(true);
		Dimension d1 = b1.getSize();
		System.out.println("Button size: "+ d1.width 
				+" "+ d1.height);
		Dimension d2 = f.getSize();
		System.out.println("Frame size: "+ d2.width
				+ " "+ d2.height);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			f.setVisible(false);
			f.setBounds(20, 20, 100, 100);
			f.setVisible(true);
			Dimension d3 = f.getSize();
			System.out.println("Frame size: "+ d3.width
					+ " "+ d3.height);
			System.out.println(f.paramString());
		}
	}
}
