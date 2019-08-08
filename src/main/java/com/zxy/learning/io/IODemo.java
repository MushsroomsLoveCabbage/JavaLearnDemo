package com.zxy.learning.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class IODemo {
	public static void main(String[] args) {
		try {
			InputStream io = new FileInputStream("text.txt");
			Reader reader = new FileReader("text.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
