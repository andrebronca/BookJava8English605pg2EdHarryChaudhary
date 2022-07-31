package j002.cap17;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

//example 17.19
public class TextFieldTest {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		TextField tf1 = new TextField();
		TextField tf2 = new TextField(8);
		TextField tf3 = new TextField("matrix");
		TextField tf4 = new TextField("matrix", 20);
		
		TextArea ta1 = new TextArea();
		TextArea ta2 = new TextArea(3, 8);
		TextArea ta3 = new TextArea("abcz\nxyz\naaa");
		TextArea ta4 = new TextArea("abc\nxyz\naaa", 2, 2);
		TextArea ta5 = new TextArea("abc\nxyz\naaa", 4, 20,
				TextArea.SCROLLBARS_BOTH);
		
		f.add(tf1); f.add(tf2); f.add(tf3); f.add(tf4);
		f.add(ta1); f.add(ta2); f.add(ta3); f.add(ta4);
		f.add(ta5);
		
		tf1.setText("abc");
		System.out.println(tf3.getText());
		tf3.setEditable(false);
		f.setSize(800, 400);
		f.setVisible(true);
	}
}
