package j002.cap18;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

//example 18.13
//pg 471
public class FocusTest extends Frame 
	implements FocusListener{
	private static final long serialVersionUID = 1L;
	static TextField tf1, tf2;
	
	public static void main(String[] args) {
		FocusTest f = new FocusTest();
		f.setLayout(new FlowLayout());
		tf1 = new TextField(8);
		tf1.setBackground(Color.blue);
		tf1.addFocusListener(f);
		tf2 = new TextField(8);
		tf2.setBackground(Color.blue);
		tf2.addFocusListener(f);
		f.add(tf1);
		f.add(tf2);
		f.setSize(200, 200);
		f.setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent e) {
		TextField tf = (TextField) e.getSource();
		tf.setBackground(Color.red);
	}

	@Override
	public void focusLost(FocusEvent e) {
		TextField tf = (TextField) e.getSource();
		tf.setBackground(Color.blue);
	}

}
