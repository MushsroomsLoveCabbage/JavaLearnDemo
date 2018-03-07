package com.zxy.learning.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOBasic {
	public static void main(String[] args) {
		int count = countWordInFile("C:\\Users\\Administrator\\Desktop\\test.txt","zhong");
		System.out.println(count);
	}
	/**
	 * 在文件中查找某个字符串出现次数
	* @Title: countWordInFile 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param fileName
	* @param @param word
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	public static int countWordInFile(String fileName, String word) {
		int count = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null){
				int index = -1;
				while (line.length() >= word.length()) {
					index = line.indexOf(word);
					System.out.println(index);
					count++;
					line = line.substring(index + word.length());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
}
