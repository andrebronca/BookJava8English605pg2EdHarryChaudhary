package j002.cap17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

//page 433
public class ListTest2 extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Button b1, b2, b3, b4, b5, b6;
	List l1, l2;
	TextField tf1, tf2;
	
	public ListTest2() {
		setLayout(new GridLayout(3,3));
		l1 = new List(3, true);
		l2 = new List(3, true);
		b1 = new Button(">");
		b2 = new Button(">>");
		b3 = new Button("<");
		b4 = new Button("<<");
		b5 = new Button("Add");
		b6 = new Button("Add");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		tf1 = new TextField();
		tf2 = new TextField();
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(4,1));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		add(l1); add(p1); add(l2);
		add(tf1); add(new Label()); add(tf2);
		add(b5); add(new Label()); add(b6);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListTest2();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		if (b == b1) {
			String s[] = l1.getSelectedItems();
			for(int i = 0; i < s.length; i++) {
				l2.add(s[i]);
				l1.remove(s[i]);
			}
		}
		else if (b == b2) {
			String s[] = l1.getItems();
			for(int i = 0; i < s.length; i++) {
				l2.add(s[i]);
				l1.remove(s[i]);
			}
		}
		else if (b == b3) {
			String s[] = l2.getSelectedItems();
			for(int i = 0; i < s.length; i++) {
				l1.add(s[i]);
				l2.remove(s[i]);
			}
		}
		else if (b == b4) {
			String s[] = l2.getItems();
			for(int i = 0; i < s.length; i++) {
				l1.add(s[i]);
				l2.remove(s[i]);
			}
		}
		else if (b == b5) {
			if (tf1.getText() != null) {
				l1.add(tf1.getText());
			}
			tf1.setText(null);
			tf1.requestFocus();
		}
		else if (b == b6) {
			if (tf2.getText() != null) {
				l2.add(tf2.getText());
			}
			tf2.setText(null);
			tf2.requestFocus();
		}
	}

}
