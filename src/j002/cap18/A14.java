package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//example 18.14
public class A14 extends Frame implements ActionListener {
	static TextField tf1, tf2;
	static Button b1;

	public static void main(String[] args) {
		A14 f = new A14();
		f.setLayout(new FlowLayout());
		f.addWindowListener(new B14());
		tf1 = new TextField(8);
		tf2 = new TextField(8);
		b1 = new Button("Set");
		b1.addActionListener(f);
		f.add(tf1);
		f.add(tf2);
		f.add(b1);
		f.setSize(200, 200);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf2.requestFocus();
	}

}

class B14 extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		Frame f = (Frame) e.getWindow();
		f.dispose();
	}
}