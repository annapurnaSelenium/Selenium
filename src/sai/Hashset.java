package sai;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<String> h=new HashSet<>();
		h.add("prasanna");
		h.add("usha");
		h.add("vijja");
		h.add("akhila");
		h.add("sp");
		System.out.println(h.size());
		Iterator<String>  it=h.iterator();
		while (it.hasNext()) {
			
		System.out.println(it.next());
		}

	}

}
