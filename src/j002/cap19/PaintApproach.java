package j002.cap19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//example 19.6
public class PaintApproach extends Frame implements MouseListener{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		PaintApproach f = new PaintApproach();
		f.setSize(300, 300);
		f.addMouseListener(f);
		f.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked...");
		Graphics g = getGraphics();
		g.setColor(Color.yellow);
		g.fillRect(0, 0, getSize().width, getSize().height);
		g.setColor(Color.red);
		g.fillOval(e.getX() - 10, e.getY() - 10, 20, 20);
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
