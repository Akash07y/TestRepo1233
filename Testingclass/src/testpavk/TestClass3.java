package testpavk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class TestClass3 {
	
	public static void main(String[] args) 
	{
		System.out.println("------List---------");
//		List list = new ArrayList();
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Velocity");
		list.add("Class");
		list.add("July");
		list.add("2020");
		
//		int l = list.size();
//		System.out.println(list.get(4));
		
		Iterator i = list.iterator();
		
		for(String data : list) 
		{
			System.out.println(i.next());
		}
		i = list.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		
		System.out.println("------Set---------");
		
		HashSet<Character> set = new HashSet<Character>();
		
		set.add('V');
		set.add('C');
		set.add('J');
		set.add('2');
		
		i = set.iterator();
		
		for(Object data : set) 
		{
			System.out.println(i.next());
		}
		
		
		System.out.println("------HashMap---------");
		
		HashMap<Character,String> map = new HashMap<Character,String>();
		
		map.put('A', "Velocity");
		map.put('B', "Class");
		map.put('C', "2020");
		
		for(Entry e : map.entrySet()) {
			
			System.out.println(e.getKey() + " = " +e.getValue());
		
		}
		
		
		System.out.println("------HashTable---------");
		
		Hashtable<String,String> table = new Hashtable<String,String>();
		
		table.put("Key1", "Class");
		table.put("Key2", "Class");
		table.put("Key3", "2020");
		table.put("Key2", "Add");
		for(Entry e : table.entrySet()) {
			
			System.out.println(e.getKey() + " = " +e.getValue());
		
		}
		
	
	}
}
