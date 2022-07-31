package j002.cap18;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

//example 18.8
public class KeyModifierDemo extends Frame 
	implements ActionListener {

	private static final long serialVersionUID = 1L;
	Button b;
	
	public KeyModifierDemo() {
		b = new Button("Button");
		b.addActionListener(this);
		setLayout(new FlowLayout());
		add(b);
		setBounds(100, 100, 200, 200);
		setVisible(true);
		System.out.println("Shift " +(1 << 6));
		System.out.println("Ctrl "+ (1 << 7));
		System.out.println("Alt "+ (1 << 9));
	}
	
	public static void main(String[] args) {
		new KeyModifierDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button pressed");
		int ms = e.getModifiers();
		System.out.println("ms: "+ ms );
		if ((ms & InputEvent.CTRL_DOWN_MASK) != 0) { //128
			System.out.println("CTRL key was pressed");
		}
		if ((ms & InputEvent.SHIFT_DOWN_MASK) != 0){ //64
			System.out.println("Shift key was pressed");
		}
		if ((ms & InputEvent.ALT_DOWN_MASK) != 0) { //512
			System.out.println("Alt key was pressed");
		}
	}

}
