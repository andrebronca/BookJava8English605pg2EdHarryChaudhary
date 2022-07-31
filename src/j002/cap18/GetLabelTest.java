package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 18.10
public class GetLabelTest {
	private Button b1, b2, b3;
	public static final String PUSH = "Push me";
	public static final String CLICK = "Click me";
	public static final String HIT = "Hit me";
	
	public GetLabelTest() {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 300);
		b1 = new Button(GetLabelTest.PUSH);
		b2 = new Button(GetLabelTest.CLICK);
		b3 = new Button(GetLabelTest.HIT);
		f.add(b1); f.add(b2); f.add(b3);
		B10 obj = new B10();
		b1.addActionListener(obj);
		b2.addActionListener(obj);
		b3.addActionListener(obj);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GetLabelTest();
	}
}

class B10 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		String s = b.getLabel();
		if (s.equals(GetLabelTest.PUSH)) {
			System.out.println("first pressed");
		}
		else if (s.equals(GetLabelTest.CLICK)) {
			System.out.println("second pressed");
		}
		else if (s.equals(GetLabelTest.HIT)) {
			System.out.println("third pressed");
		}
	}
}