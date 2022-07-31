package j002.cap16;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 16.8
public class CopyApp extends Applet implements ActionListener {
	TextField tf1, tf2;
	Button b1;
	
	@Override
	public void init() {
		setForeground(Color.gray);
		Font f1 = new Font("Arial", Font.BOLD+Font.ITALIC, 20);
		tf1 = new TextField(8);
		tf2 = new TextField(8);
		tf1.setFont(f1);
		tf2.setFont(f1);
		
		b1 = new Button("Copy");
		b1.addActionListener(this);
		b1.setFont(f1);
		add(tf1);
		add(tf2);
		add(b1);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("Matrix", 0, 150);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = tf1.getText();
		tf2.setText(s1);
	}
}
