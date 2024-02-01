package com.walking.HomeWork_lesson31;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		
		try (InputStream in = new FileInputStream("D://1//test.txt")){
			
			System.out.println(in.available());
//			int i=-1;
//	        while((i=in.read())!=-1){
//	                System.out.print((char)i);
//		}
	        }
	            catch (Exception e) {
			System.out.println("!!! " + e.getMessage());
		}

	}

}
