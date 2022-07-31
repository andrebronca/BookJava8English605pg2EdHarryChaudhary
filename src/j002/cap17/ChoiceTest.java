package j002.cap17;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

//example 17.16
public class ChoiceTest {
	public static void main(String[] args) throws InterruptedException {
		Frame f = new Frame("Testing Choice Component");
		f.setLayout(new FlowLayout());
		f.setSize(100, 100);
		f.setVisible(true);

		Choice c1 = new Choice();
		c1.add("Breakfast");
		c1.add("Lunch");
		c1.add("Dinner");
		f.add(c1);
		c1.select("Dinner"); //select(2)
		Thread.sleep(1000);
		System.out.println(c1.getSelectedItem());
		System.out.println(c1.getSelectedIndex());
		System.out.println(c1.getItemCount());
		System.out.println(c1.getItem(0));
		c1.insert("Brunch", 1);
		c1.remove(2); //remove("Lunch")
	}
}
