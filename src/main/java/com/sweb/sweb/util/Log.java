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
	
	public void Path(String Path) {
		this.Path = Path;
	}
	
	public void info(String str) {
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
			FileWriter fw = new FileWriter(Path + sdf.format(new Date()) + ".txt", true);
			sdf.applyPattern("yyyy-MM-dd-hh:mm:ss"); // sdf 패턴 변경
			fw.write(sdf.format(new Date()) + " - " + str + "\r\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		fw.write("\t\n"); // 줄바꾸기 기호 \t\n 같이 씀
		
	}
}
