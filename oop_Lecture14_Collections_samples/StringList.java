package oop_Lecture14_Collections_samples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StringList{

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("Fatemeh");
		strings.add("Sean");
		strings.add("LINA");
		strings.add("Anca");
		strings.add("ABEY");
		strings.sort(String.CASE_INSENSITIVE_ORDER);
		Iterator<String> ns = strings.iterator();
		while(ns.hasNext()) {
			System.out.println(ns.next());
		}
		strings.remove(1);
		ns = strings.iterator();
		while(ns.hasNext()) {
			System.out.println(ns.next());
		}
		

	}

}
