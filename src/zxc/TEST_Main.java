package zxc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TEST_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<Integer> al = new ArrayList<>();
		
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(2);
		al.add(15);
		
		System.out.println(al.toString());
		
		Collection<Integer> si = new HashSet<>(al);
		
		System.out.println(si.remove(6));
		
		System.out.println(si.toString());
		
	}

}
