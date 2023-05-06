package Navigbleset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("a");
		list.add("b");
		
		Iterator<String> iter = list.iterator();
		
		
		while(iter.hasNext()) {
			String el = iter.next();
			list.add("c");
			System.out.println(el);
		}

	}

}
