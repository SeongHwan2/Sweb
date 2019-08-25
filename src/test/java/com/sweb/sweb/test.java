package com.sweb.sweb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class test {
	
	public static void main(String[] args) throws IOException {
		// FileNotFoundException
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		// 한줄씩 읽음 readLine() 없으면 null
		String read = null;
		while((read = br.readLine()) != null) {
			System.out.println(read);
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		bw.write("test");
		bw.newLine();
		bw.write("toto");
		bw.newLine();
		bw.write("okay");
		
		
		br.close();
		bw.close();
		
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("test_copy.txt");
		byte[] buff = new byte[fis.available()];
		fis.read(buff);
		System.out.println(buff[0]);
		fos.write(buff);
		System.out.println(buff[0]);
		fos.write(buff);
		
		fis.close();
		fos.close();
		
		FileWriter fw = new FileWriter("tttt.txt", true);
	}
}
