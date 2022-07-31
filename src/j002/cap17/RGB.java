package j002.cap17;

import java.applet.Applet;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

//example 17.22
public class RGB extends Applet  implements AdjustmentListener {

	private static final long serialVersionUID = 1L;
	TextField tf1;
	Scrollbar sb1, sb2, sb3;
	
	@Override
	public void init() {
		setLayout(new GridLayout(4, 1));
		sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);
		sb3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 255);
		
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
		
		tf1 = new TextField(8);
		add(tf1); add(sb1);
		add(sb2); add(sb3);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int a = 0, b = 0, c = 0;
		a = sb1.getValue();
		b = sb2.getValue();
		c = sb3.getValue();
		Color c1 = new Color(a, b, c);
		tf1.setBackground(c1);
	}
	
}
