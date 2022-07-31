package j002.cap17;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;


//example 17.18
public class ListTest {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		List l1 = new List(3, true);
		l1.add("India");
		l1.add("Nepal");
		l1.add("Shri Lanka");
		l1.add("USA");
		l1.add("UK");
		f.add(l1);
		System.out.println(l1.getRows());
		System.out.println(l1.getItemCount());
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
