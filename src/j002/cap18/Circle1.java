package j002.cap18;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//example 18.20
public class Circle1 extends Frame 
	implements MouseListener, Runnable{
	
	int x, y, w, h;
	static Circle1 f;

	@Override
	public void run() {
		y = 50;
		w = 50;
		h = 50;
		for(x = 0; x < 500; x += 10) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			repaint();
		}
	}
	
	public static void main(String[] args) {
		f = new Circle1();
		Thread t = new Thread(f);
		t.start();
		f.addMouseListener(f);
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(x, y, w, h);
		g.setColor(Color.BLUE);
		g.fillOval(x + 1, y + 1, w - 1, h - 1);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		w = 50;
		h = 50;
		Graphics g = f.getGraphics();
		g.clearRect(0, 0, 200, 200);
		paint(g);
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
