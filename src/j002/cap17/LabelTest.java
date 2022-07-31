package j002.cap17;

import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

//example 17.17
public class LabelTest {
	public static void main(String[] args) {
		Frame f = new Frame("Testing Label Component");
		f.setLayout(new GridLayout(3, 3));
		f.setFont(new Font("Arial", Font.PLAIN, 20));
		Label l1 = new Label("India", Label.LEFT);
		Label l2 = new Label("Pakistan", Label.LEFT);
		Label l3 = new Label("UK", Label.LEFT);
		Label l4 = new Label("India", Label.CENTER);
		Label l5 = new Label("Pakistan", Label.CENTER);
		Label l6 = new Label("Uk", Label.CENTER);
		Label l7 = new Label("India", Label.RIGHT);
		Label l8 = new Label("Pakistan", Label.RIGHT);
		Label l9 = new Label("UK", Label.RIGHT);
		l3.setText("USA");
		System.out.println(l1.getText());
		f.add(l1); f.add(l4); f.add(l7);
		f.add(l2); f.add(l5); f.add(l8);
		f.add(l3); f.add(l6); f.add(l9);
		
		f.setSize(500, 200);
		f.setVisible(true);
	}
}
