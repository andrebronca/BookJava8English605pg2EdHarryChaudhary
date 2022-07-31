package j002.cap17;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FileDialogTest {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(200, 200);
		f.setVisible(true);
		
		FileDialog fd = new FileDialog(f, "Load file", FileDialog.LOAD);
		fd.setVisible(true);
		System.out.println(fd.getFile());
		System.out.println(fd.getDirectory());
	}
}
