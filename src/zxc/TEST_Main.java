package zxc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TEST_Main {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(5, 2, 4, 7, -6, -10);
		System.out.println(l);
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(l);
		System.out.println(arr);
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addAll(l);
		Collections.sort(arr);
		System.out.println(arr);
		
//		ArrayList<Integer> ci = new ArrayList<>();
//		//0
//		ci.add(1);
//		
//		//1
//		ci.add(2);
//		
//		//2
//		ci.add(3);
//		
//		//3
//		ci.add(3);
//		
//		//4
//		ci.add(3);
//		
//		System.out.println(ci);
//		
//		//System.out.println(ci.indexOf(2));
//		
//		
//		System.out.println(ci.remove(1));
//		
//		System.out.println(ci);
				
	}

}
