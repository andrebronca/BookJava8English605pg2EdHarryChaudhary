package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 18.9
public class ButtonRefTest {
	Button b1, b2, b3;
	
	public ButtonRefTest() {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 300);
		b1 = new Button("Push me");
		b2 = new Button("Click me");
		b3 = new Button("Hit me");
		f.add(b1); f.add(b2); f.add(b3);
		B9 obj = new B9(b1, b2, b3);
		b1.addActionListener(obj);
		b2.addActionListener(obj);
		b3.addActionListener(obj);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonRefTest();
	}
}

class B9 implements ActionListener{
	Button b4, b5, b6;

	public B9(Button b1, Button b2, Button b3) {
		b4 = b1;
		b5 = b2;
		b6 = b3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		if (b == b4) {
			System.out.println("First button was pressed");
		}
		else if (b == b5) {
			System.out.println("Second button was pressed");
		}
		else if (b == b6) {
			System.out.println("Third button was pressed");
		}
	}
	
}