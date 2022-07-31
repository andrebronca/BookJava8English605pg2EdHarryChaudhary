package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 18.11
public class ActionCommandTest {
	private Button b1, b2, b3;
	public static final String PUSH = "Push me";
	public static final String FIRST = "First";
	public static final String SECOND = "Second";
	public static final String THIRD = "Third";
	
	public ActionCommandTest() {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 300);
		b1 = new Button(PUSH);
		b2 = new Button(PUSH);
		b3 = new Button(PUSH);
		b1.setActionCommand(FIRST);
		b2.setActionCommand(SECOND);
		b3.setActionCommand(THIRD);
		f.add(b1);	f.add(b2);	f.add(b3);
		B11 obj = new B11();
		b1.addActionListener(obj);
		b2.addActionListener(obj);
		b3.addActionListener(obj);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionCommandTest();
	}
}

class B11 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		String s = b.getActionCommand();
		if (s.equals(ActionCommandTest.FIRST)) {
			System.out.println("1 pressed");
		}
		else if (s.equals(ActionCommandTest.SECOND)) {
			System.out.println("2 pressed");
		}
		else if (s.equals(ActionCommandTest.THIRD)) {
			System.out.println("3 pressed");
		}
	}
	
}