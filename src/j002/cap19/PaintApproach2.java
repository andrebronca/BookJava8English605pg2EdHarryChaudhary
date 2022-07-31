package j002.cap19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PaintApproach2 extends Frame implements MouseListener {

	private static final long serialVersionUID = 1L;
	int mouseX, mouseY;
	
	public static void main(String[] args) {
		PaintApproach2 f = new PaintApproach2();
		f.setSize(300, 300);
		f.addMouseListener(f);
		f.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse clicked...");
		mouseX = e.getX();
		mouseY = e.getY();
		Graphics g = getGraphics();
		paint(g);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.clearRect(0, 0, getSize().width, getSize().height);
		g.setColor(Color.red);
		g.fillOval(mouseX - 10, mouseY - 10, 20, 20);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
