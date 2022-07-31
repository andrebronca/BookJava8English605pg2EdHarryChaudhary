package j002.cap17;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxTest2 extends Frame 
	implements ItemListener {

	private static final long serialVersionUID = 1L;
	Checkbox c1;
	TextField tf1;
	
	public CheckboxTest2() {
		setLayout(new GridLayout(2, 1));
		c1 = new Checkbox("Red");
		c1.addItemListener(this);
		add(c1);
		tf1 = new TextField();
		add(tf1);
		setSize(100, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckboxTest2();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (c1.getState()) {
			tf1.setBackground(Color.red);
		} else {
			tf1.setBackground(Color.white);
		}
		
	}

}
