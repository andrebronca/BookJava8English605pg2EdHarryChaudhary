package j002.cap18;

import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//example 18.16
public class MyMenu extends Frame implements ActionListener, WindowListener, ItemListener {

	private static final long serialVersionUID = 1L;
	TextField tf1;
	String msg = "";
	CheckboxMenuItem item4;
	public static final String NEW_ITEM = "New...";
	public static final String OPEN_ITEM = "Open...";
	public static final String OPTION_ITEM = "Option 1";

	public MyMenu() {
		super("Matrix");
		setLayout(new FlowLayout());
		tf1 = new TextField(8);
		add(tf1);
		MenuBar mbar = new MenuBar();
		Menu file = new Menu("File");

		MenuItem item1 = new MenuItem(NEW_ITEM);
		item1.addActionListener(this);
		file.add(item1);

		MenuItem item2 = new MenuItem(OPEN_ITEM);
		item2.addActionListener(this);
		file.add(item2);

		Menu sub = new Menu("Sub Menu");
		MenuItem item3 = new MenuItem(OPTION_ITEM);
		item3.addActionListener(this);
		sub.add(item3);
		file.add(sub);

		item4 = new CheckboxMenuItem("TextBox", true);
		item4.addActionListener(this);
		file.add(item4);
		mbar.add(file);
		addWindowListener(this);
		setMenuBar(mbar);
		setSize(400, 400);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 150, 250);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = (String) e.getActionCommand();
		if (s1.equals(NEW_ITEM)) {
			msg = "New Selected";
			tf1.setText(msg);
		} 
		else if (s1.equals(OPEN_ITEM)) {
			msg = "Open Selected";
			tf1.setText(msg);
		}
		else if (s1.equals(OPTION_ITEM)) {
			msg = "Option Selected";
			tf1.setText(msg);
		}
		repaint();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		Frame f = (Frame) e.getWindow();
		f.dispose();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		tf1.setVisible(item4.getState());
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		new MyMenu();
	}

}
