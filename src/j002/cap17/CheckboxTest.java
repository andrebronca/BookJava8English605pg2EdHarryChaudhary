package j002.cap17;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;

//example 17.14
public class CheckboxTest {
	public static void main(String[] args) {
		Frame f = new Frame("Testing Checkbox Component");
		f.setLayout(new GridLayout(3,1));
		Checkbox c1 = new Checkbox();
		Checkbox c2 = new Checkbox("Lunch", true);
		Checkbox c3 = new Checkbox("Dinner");
		c1.setLabel("BreakFast");
		c3.setState(true);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		
		if (c1.getState()) {
			System.out.println(c1.getLabel());
		} else if (c2.getState()) {
			System.out.println(c2.getLabel());
		} else if (c3.getState()) {
			System.out.println(c3.getLabel());
		}
		
		f.setSize(100, 100);
		f.setVisible(true);
	}
}
