package j002.cap17;

import java.applet.Applet;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//example 17.10
public class CardLayoutTest extends Applet 
	implements ActionListener, MouseListener{

	private static final long serialVersionUID = 1L;
	static final String FIRST = "First";
	static final String SECOND = "Second";
	static final String COUNTRY1 = "Country1";
	static final String COUNTRY2 = "Country2";
	
	Panel mp;
	CardLayout c1;
	
	@Override
	public void init() {
		Button b1 = new Button(CardLayoutTest.FIRST);
		Button b2 = new Button(CardLayoutTest.SECOND);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
		Panel p1 = new Panel();
		Label l1 = new Label("INDIA");
		p1.add(l1);
		
		Panel p2 = new Panel();
		Label l2 = new Label("USA");
		p2.add(l2);
		
		mp = new Panel();
		c1 = new CardLayout();
		mp.setLayout(c1);
		mp.add(p1, CardLayoutTest.COUNTRY1);
		mp.add(p2, CardLayoutTest.COUNTRY2);
		add(mp);
		addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		if (b.getLabel().equals("First")) {
			c1.show(mp, CardLayoutTest.COUNTRY1);
		} else {
			c1.show(mp, CardLayoutTest.COUNTRY2);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		c1.next(mp);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
