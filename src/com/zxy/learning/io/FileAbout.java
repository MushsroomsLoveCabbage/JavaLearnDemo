/**
 * Creation Date:2017年12月18日-下午4:42:00
 * 
 * 
 */
package com.zxy.learning.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 * Description Of The Class<br/>
 * 
 * 
 * @author zxy
 * @Connect Mail:1363320658@qq.com
 * @version 1.0.0, 2017年12月18日-下午4:42:00
 * @since 2017年12月18日-下午4:42:00
 */
public class FileAbout {
	public static void main(String[] args)  {
		try {
			
			charWriter();
			charReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeFile()throws IOException {
		String hello = "it's new world";
		byte[] byteArray = hello.getBytes();
		File file = new File("C:\\Users\\admin\\Desktop\\笔记\\file\\demo01.txt");
		OutputStream os = new FileOutputStream(file);
		os.write(byteArray);
		os.close();
	}
	public static void readFile() throws IOException {
		File file = new File("C:\\Users\\admin\\Desktop\\笔记\\file\\demo01.txt");
		byte[] byteArray = new byte[(int) file.length()];
		InputStream is = new FileInputStream(file);
		int size = is.read(byteArray);
		System.out.println(new String(byteArray));
		is.close();
	}
	public static void charReader() throws IOException {
		
		File file = new File("C:\\Users\\admin\\Desktop\\笔记\\file\\charReader.txt");
		Reader reader = new FileReader(file);
		char[] charArray = new char[(int) file.length()];
		int size = reader.read(charArray);
		System.out.println(new String(charArray));
		reader.close();
	}
	public static void charWriter() throws IOException {
		String hello = new String("It's a test about io!");
		File file = new File("C:\\Users\\admin\\Desktop\\笔记\\file\\charReader.txt");
		Writer os = new FileWriter(file);
		os.write(hello);
		os.close();
	}
	
	public static void convertByteToChar() throws IOException {
		File file = new File("C:\\Users\\admin\\Desktop\\笔记\\file\\charReader.txt");
		InputStream  is = new FileInputStream(file);
		Reader re = new InputStreamReader(is);
		char[] charArray = new char[(int) file.length()];
		int size = re.read(charArray);
		is.close();
		re.close();
	}
	public static void readByBufferedInputStream() throws Exception {
		File file = new File("C:\\Users\\admin\\Desktop\\笔记\\file\\charReader.txt");
		Reader reader = new BufferedReader(new FileReader(file),2*1024);
		char[] byteArray =  new char[(int) file.length()];
		int size = reader.read(byteArray);
		reader.close();
	}
}

