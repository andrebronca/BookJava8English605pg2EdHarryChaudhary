package j002.cap17;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxItemTest extends Frame 
	implements ItemListener{

	private static final long serialVersionUID = 1L;
	TextField tf1;
	Choice c1;
	
	public CheckboxItemTest() {
		setLayout(new FlowLayout());
		c1 = new Choice();
		c1.add("red");
		c1.add("gree");
		c1.add("blue");
		tf1 = new TextField(30);
		tf1.setBackground(Color.red);
		c1.addItemListener(this);
		add(c1);
		add(tf1);
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckboxItemTest();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s = (String) e.getItem();
		if (s.equals("red")) {
			tf1.setBackground(Color.red);
		}
		else if (s.equals("gree")) {
			tf1.setBackground(Color.green);
		}
		else if (s.equals("blue")) {
			tf1.setBackground(Color.blue);
		}
	}

}
