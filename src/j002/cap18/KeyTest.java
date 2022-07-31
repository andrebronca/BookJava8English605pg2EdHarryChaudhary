package j002.cap18;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//example 18.12
public class KeyTest extends Frame 
	implements KeyListener {
	String msg = "";
	int x = 50, y = 100;
	
	public static void main(String[] args) {
		Frame f = new KeyTest();
		f.setSize(300, 300);
		f.addKeyListener((KeyTest)f);
		f.setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("key typed");
		msg += e.getKeyChar();
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("key pressed");
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_F1:
			msg += "<f1>";
			break;
		case KeyEvent.VK_F2:
			msg += "<f2>";
			break;
		case KeyEvent.VK_F3:
			msg += "<f3>";
			break;
		case KeyEvent.VK_PAGE_DOWN:
			msg += "<PgDn>";
			break;
		case KeyEvent.VK_PAGE_UP:
			msg += "<PgUp>";
			break;
		case KeyEvent.VK_LEFT:
			msg += "<left arrow>";
			break;
		case KeyEvent.VK_RIGHT:
			msg += "<right arrow>";
			break;
		case KeyEvent.VK_CONTROL:
			msg += "<ctrl>";
			break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("key up");
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawString(msg, x, y);
	}
}
