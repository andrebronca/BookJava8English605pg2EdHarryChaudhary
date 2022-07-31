package j002.cap16;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 16.9
public class SumApplet extends Applet implements ActionListener{
	TextField tf1, tf2, tf3;
	Label l1, l2, l3;
	Button b1;
	
	@Override
	public void init() {
		setLayout(new GridLayout(4,2));
		l1 = new Label("Nr. 1");
		l2 = new Label("Nr. 2");
		l3 = new Label("Result");
		tf1 = new TextField(8);
		tf2 = new TextField(8);
		tf3 = new TextField(8);
		b1 = new Button("Sum");
		b1.addActionListener(this);
		add(l1); add(tf1);
		add(l2); add(tf2);
		add(l3); add(tf3);
		add(b1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button abc = (Button) e.getSource();
		if (abc == b1) {
			int a, b, c;
			a = Integer.parseInt(tf1.getText());
			b = Integer.parseInt(tf2.getText());
			c = a + b;
			tf3.setText(String.valueOf(c));
		}
	}

}
