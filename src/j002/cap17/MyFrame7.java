package j002.cap17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

//example 17.7
public class MyFrame7 {
	public static void main(String[] args) {
		Frame f = new Frame();
		Scrollbar sbRight = new Scrollbar(Scrollbar.VERTICAL);
		f.add(sbRight, BorderLayout.EAST);
		Scrollbar sbLeft = new Scrollbar(Scrollbar.VERTICAL);
		f.add(sbLeft, BorderLayout.WEST);
		Label labelTop = new Label("This is North");
		labelTop.setFont(new Font("Serif", Font.ITALIC, 36));
		labelTop.setForeground(Color.white);
		labelTop.setBackground(Color.black);
		f.add(labelTop, BorderLayout.NORTH);
		Label labelBottom = new Label("This is South");
		labelBottom.setFont(new Font("Monospaced", Font.BOLD, 18));
		labelBottom.setForeground(Color.white);
		labelBottom.setBackground(Color.black);
		f.add(labelBottom, BorderLayout.SOUTH);
		f.setSize(500,200);
		f.setVisible(true);
	}
}
