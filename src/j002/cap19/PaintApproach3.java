package j002.cap19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PaintApproach3 extends Frame
	implements MouseListener{
	
	int mouseX, mouseY;
	
	public static void main(String[] args) {
		PaintApproach3 f = new PaintApproach3();
		f.setSize(300, 300);
		f.addMouseListener(f);
		f.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse clicked...");
		mouseX = e.getX();
		mouseY = e.getY();
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, getSize().width, getSize().height);
		g.setColor(Color.gray);
		g.fillOval(mouseX - 10, mouseY - 10, 20, 20);
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
