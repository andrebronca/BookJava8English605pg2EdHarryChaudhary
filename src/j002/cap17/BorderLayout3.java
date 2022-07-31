package j002.cap17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

//example 17.9
public class BorderLayout3 extends Frame {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		Frame f = new BorderLayout3();
//		f.setLayout(new BorderLayout());
		Panel toolbar = new Panel();
		toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
		toolbar.setBackground(Color.lightGray);
		toolbar.add(new Button("This"));
		toolbar.add(new Button("is"));
		toolbar.add(new Button("the"));
		toolbar.add(new Button("toolbar"));
		f.add(toolbar, BorderLayout.NORTH);
		TextField status = new TextField("Status");
		status.setFont(new Font("Monospaced", Font.BOLD, 48));
		f.add(status, BorderLayout.SOUTH);
		f.setSize(300, 300);
		f.setVisible(true);
	}

}
