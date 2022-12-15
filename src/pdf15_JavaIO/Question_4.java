package pdf15_JavaIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramSocketImpl;

import javax.xml.crypto.Data;

public class Question_4 {

	/*
	 * 4. Write text to a .txt file using BufferedOutputStream
	 */
	static String OutputFilePath = "..//JalaAcademy/TextFile/BufferedOutputFile.txt";

	public static void main(String[] args) throws IOException {
		File file = new File(OutputFilePath);
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] text = "Buffered Output Text".getBytes();
		bos.write(text);
		bos.close();
		System.out.println("Buffered Output Text");
		
		}
}
