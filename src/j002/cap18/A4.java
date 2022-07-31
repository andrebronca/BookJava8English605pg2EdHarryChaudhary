package j002.cap18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 18.4
public class A4 implements ActionListener{
	
	static Button b1 = null, b2 = null;
	static TextField tf1 = null, tf2 = null, tf3 = null;
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new GridLayout(4, 2));
		f.setSize(500, 300);
		Label l1 = new Label("Nr 1");
		Label l2 = new Label("Nr 2");
		Label l3 = new Label("Result");
		
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		b1 = new Button("Sum");
		b2 = new Button("Avg");
		b1.addActionListener(new A4());
		b2.addActionListener(new A4());
		
		f.add(l1); f.add(tf1);
		f.add(l2); f.add(tf2);
		f.add(l3); f.add(tf3);
		f.add(b1); f.add(b2);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int a, b, c;
		float m;
		
		a = Integer.parseInt(tf1.getText());
		b = Integer.parseInt(tf2.getText());
		c = a + b;
		m = c / 2.0f;
		
		if (e.getSource() == b1) {
			tf3.setText(""+ c);
		} else {
			tf3.setText(""+ m);
		}
	}

}
