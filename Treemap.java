package Navigbleset;

import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "tiger");
		tmap.put(10, "lion");
		tmap.put(100, "jaguar");
		tmap.put(1000, "leopoard");
		tmap.put(10000, "cheetah");
		
		System.out.println(tmap);
		
		tmap.forEach((k,v) -> System.out.println("keys : " + k +" values: " + v));
		System.out.println("last key : " + tmap.lastKey());
		System.out.println("first key : " + tmap.firstKey());
		
		Set<Integer> keyslessthan3k = tmap.headMap(3000).keySet();
		System.out.println(keyslessthan3k);

	}

}
