package com.walking.HomeWork_lesson30_task1_2;

public class Main {

	public static void main(String[] args) {
		
		String str1 = "+7 (121) 333-23-43";
		String str2 = "+7 (121) 3332343";
		String str3 = "+7 121 333-23-43";
		String str4 = "+7(121)333-23-43";
		String str5 = "+7(121)3332343";
		String str6 = "+71213332343";
		String str7 = "+7 (1121) 333-23-43";
		String str8 = "+7(121) 333-23-43";
		String str9 = "+7 121) 333-23-43";
		String str10 = "+7 (121)333-23-43";
		String str11 = "+(7 121)333-23-43";
		String str12 = "+7 (121) 333-2343";

		
		System.out.println(isValidPhoneNumber(str1));
		System.out.println(isValidPhoneNumber(str2));
		System.out.println(isValidPhoneNumber(str3));
		System.out.println(isValidPhoneNumber(str4));
		System.out.println(isValidPhoneNumber(str5));
		System.out.println(isValidPhoneNumber(str6));
		System.out.println(isValidPhoneNumber(str7));
		System.out.println(isValidPhoneNumber(str8));
		System.out.println(isValidPhoneNumber(str9));
		System.out.println(isValidPhoneNumber(str10));
		System.out.println(isValidPhoneNumber(str11));
		System.out.println(isValidPhoneNumber(str12));
		

	}
	
	private static boolean isValidPhoneNumber(String str){
		return str.matches("\\+7((\\s|\\S){0,2})\\d{3}((\\s|\\S){0,2})\\d{3}((\\s|\\S|\\-){0,1})\\d{2}((\\s|\\S|\\-){0,1})\\d{2}");
	}
}
