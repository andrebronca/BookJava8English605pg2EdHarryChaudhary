package j002.cap17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class MyFrame6 extends Frame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Frame f = new MyFrame6();
		f.setLayout(new GridLayout(5,3));
		for(int row = 0; row < 5; row++) {
			f.add(new Label("Label"+ row));
			f.add(new Button("Button"+ row));
			f.add(new TextField("TextField"+ row));
		}
		f.setSize(500,200);
		f.setVisible(true);
	}
}
