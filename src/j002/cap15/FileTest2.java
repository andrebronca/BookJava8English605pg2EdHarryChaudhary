package j002.cap15;

import java.io.File;
import java.io.IOException;

//example 15.1
public class FileTest {
	public static void main(String[] args) throws IOException {
		String pathFile = "/Users/andrebronca/eclipse_workspace_ide/j002-IntroductionToJava8/src/j002/cap15/FileTest.java";
		File f = new File(pathFile);
		if (!f.exists()) {
			f.createNewFile();
		}
		System.out.println("Length = "+ f.length() +" bytes");
		System.out.println("Name = "+ f.getName());
		System.out.println("Parent = "+ f.getParent());
		System.out.println("Path = "+ f.getPath());
		System.out.println("Absolute Path = "+ f.getAbsolutePath());
		System.out.println(f.exists() ? "Exists" : "Does not exist");
		System.out.println(f.isFile() ? "is file" : "not a file");
		System.out.println(f.canRead() ? "is readable" : "not readable");
		System.out.println(f.canWrite() ? "is writable" : "not writable");
		System.out.println(f.isDirectory() ? "is directory" : "not a directory");
		System.out.println(f.isHidden() ? "is hidden" : "not hidden");
		System.out.println(f.isAbsolute() ? "is absolute" : "is not absolute");
		System.out.println("File last modified: "+ f.lastModified());
		//f.delete();
		String pathFile3 = "/Users/andrebronca/";
		File f3 = new File(pathFile3);
		String nm[] = f3.list();
		System.out.println("List of Files & sub-directories of :"+ pathFile3);
		for(int i =0; i < nm.length; i++) {
			System.out.print(nm[i]);
			File f4 = new File(pathFile3 + nm[i]);
			if (f4.isFile()) {
				System.out.println("It is a File");
			} else {
				System.out.println("It is a Directory");
			}
		}
		File f5 = new File(pathFile3 + "zzz");
		f5.mkdir();
		
		File f6 = new File(pathFile3 + "yyy/aaa");
		f6.mkdirs();
	}
}
