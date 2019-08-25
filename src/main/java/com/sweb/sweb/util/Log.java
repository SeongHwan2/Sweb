package com.sweb.sweb.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
	private String Path = "";
	
	public Log() { }
	
	public Log(String Path) {
		this.Path = Path;
	}
	
	public void info(String str) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		FileWriter fw = new FileWriter(Path + sdf.format(new Date()) + ".txt", true);
		
		
		
		fw.write("\t\n"); // 줄바꾸기 기호 \t\n 같이 씀
		fw.close();
	}
}
