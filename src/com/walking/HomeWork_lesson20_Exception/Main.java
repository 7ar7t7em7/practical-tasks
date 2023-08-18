package com.walking.HomeWork_lesson20_Exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyFyle[] fyles = {
			new MyFyle(FyleType.TEXT, "asd", 15),
			new MyFyle(FyleType.TEXT, "zxc", 27),
			new MyFyle(FyleType.IMAGE, "sdf", 78),
			new MyFyle(FyleType.AUDIO, "mp3", 123),
			new MyFyle(FyleType.VIDEO, "avi", 456)
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fyle name: \n");
		String str = sc.next();
		sc.close();
		
		try{
			System.out.println(MyFyle.findFyle(fyles, str));}
		catch (FNFException ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			System.out.println(MyFyle.findFyle(fyles, str));
		} catch (Exception e) {
			System.out.println("File not here");
		}
		
		
	}



}
