package j002.cap19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;

//example 19.1
public class SimplePaint extends Frame{

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		Frame f = new SimplePaint();
		f.setSize(200, 200);
		f.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		Color cores[] = {
				Color.gray, Color.red, Color.white, Color.green,
				Color.black, Color.cyan
		};
		g.setColor(cores[0]);
		g.fillRect(0, 0, 300, 300);
		g.setColor(Color.white);
		g.fillRect(10, 110, 20, 40);
		Font f = new Font("SansSerif", Font.PLAIN, 10);
		g.setFont(f);
		g.drawString("40", 10, 105);
		g.setColor(Color.green);
		g.fillRect(32, 95, 20, 55);
		g.drawString("55", 32, 90);
		g.setColor(Color.white);
		g.fillRect(54, 87, 20, 63);
		g.drawString("63", 54, 82);
		g.setColor(Color.green);
		g.fillRect(76, 59, 20, 91);
		g.drawString("91", 76, 54);
		g.setColor(Color.black);
		g.drawLine(4, 150, 120, 150);
		g.drawLine(4, 4, 4, 150);
		g.setColor(Color.red);
		g.drawLine(20, 110, 86, 59);
		g.setColor(Color.blue);
		//linha média
		int media = (110 + 40 + 55 + 63 + 91) / 4;
		g.drawLine(4, media, 120, media);
		
		/*
		 * (1) x = 10, y = 110, w = 20, h = 40
		 * espaço de: 2
		 * (2) x = x + w + 2
		 * y = 110 - (40 - 55)
		 * ----
		 * y = 87 - (91 - 63)
		 * 
		 */
		
		String fonts[] = Toolkit.getDefaultToolkit().getFontList();
		for(String font : fonts) {
			System.out.println(font);
		}
		/*
		 * mac os x (fontes),
		    equivalentes são idependentes de plataforma
		 	Dialog
			SansSerif	equivalente (Helvetica)
			Serif		equivalente (TimesRoman)
			Monospaced	equivalente (Courier)
			DialogInput
		
		 estilos
		 * Font.PLAIN, Font.BOLD, Font.ITALIC
		 */
	}

}
