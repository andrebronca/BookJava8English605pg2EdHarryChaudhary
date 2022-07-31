package j002.cap18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 18.18
public class Sum implements ActionListener {
	static Button b1, b2;
	static TextField tf1, tf2, tf3;
	static Frame f;

	public static void main(String[] args) {
		f = new Frame();
		Sum s1 = new Sum();
		f.setLayout(new GridLayout(4, 2));
		Label l1 = new Label("Enter nr. 1:");
		tf1 = new TextField(8);
		Label l2 = new Label("Enter nr. 2:");
		tf2 = new TextField(8);
		Label l3 = new Label("Result: ");
		tf3 = new TextField(8);
		b1 = new Button("Sum");
		b2 = new Button("Close");
		b1.addActionListener(s1);
		b2.addActionListener(s1);
		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(l3);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		f.setSize(200, 200);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		if (b == b1) {
			int n1 = Integer.parseInt(tf1.getText());
			int n2 = Integer.parseInt(tf2.getText());
			tf3.setText(String.valueOf(n1 + n2));
		}
		if (b == b2) {
			f.dispose();
		}
	}

}
