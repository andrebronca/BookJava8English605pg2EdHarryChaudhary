package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//example 18.2
public class A2 implements ActionListener{
	static Button b1 = null, b2 = null;
	
	//o conteúdo de main pode estar no construtor
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(500, 100);
		b1 = new Button("Push me");
		b2 = new Button("Click me");
		b1.addActionListener(new A2());
		b2.addActionListener(new A2());
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("button pushed");
		} else {
			System.out.println("button clicked");
		}
	}

}
