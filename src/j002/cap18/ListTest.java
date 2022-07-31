package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.List;

//example 18.17
public class ListTest extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;
	static List l1, l2;
	
	public static void main(String[] args) {
		ListTest f = new ListTest();
		f.setLayout(new FlowLayout());
		l1 = new List(3, true);
		l1.add("India");
		l1.add("Pakistan");
		l1.add("USA");
		l1.add("UK");
		l1.add("China");
		l2 = new List(3, true);
		Button b1 = new Button("Transfer");
		b1.addActionListener(f);
		f.add(l1);
		f.add(l2);
		f.add(b1);
		f.setSize(200, 200);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		for(int i = l1.getItemCount() - 1; i >= 0; i--) {
//			l2.add(l1.getItem(i));
//			l1.remove(i);
//		}
		String s1[] = l1.getSelectedItems();
		for(int i = 0; i < s1.length; i++) {
			l2.add(s1[i]);
			l1.remove(s1[i]);
		}
	}

}
