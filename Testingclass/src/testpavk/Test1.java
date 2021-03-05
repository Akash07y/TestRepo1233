package testpavk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {
	
public static void main(String[] args) {
	
	 HashSet<String> hset = new HashSet<String>();
	 hset.add("Velociry");
	 hset.add("July");
	 hset.add("Batch");
	 
	 Iterator<String> itr = hset.iterator();
	 
	 for(String a : hset)
	 {
		 System.out.println(itr.next());
	 }
	 
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
	
	Hashtable<String, String> hashtable = new Hashtable<String, String>();
	hashtable.put("Key1", "Value1");
	hashtable.put("Key2", "Value2");
	hashtable.put("Key3", "Value3");
	hashtable.put("Key4", "Value4");
	hashtable.put("Key5", "Value5");
	
//	Set<String> keys = hashtable.keySet();
//
//    Iterator<String> itr = keys.iterator();
    
    for (Map.Entry <String, String >m:hashtable.entrySet()) { 
        System.out.println(m.getKey()+" "+m.getValue()); 
    } 
    
    HashMap<String, String> hasmap = new HashMap<String, String>();
    hasmap.put("Key11", "Value11");
    hasmap.put("Key21", "Value21");
	hasmap.put("Key31", "Value31");
	hasmap.put("Key41", "Value41");
	hasmap.put("Key51", "Value51");
	
    for (Map.Entry <String, String > m:hasmap.entrySet()) { 
        System.out.println(m.getKey()+" "+m.getValue()); 
    } 
	
	    for (Map.Entry <String, String > m:hasmap.entrySet()) { 
        System.out.println(m.getKey()+" "+m.getValue()); 
    }
	
	    for (Map.Entry <String, String > m:hasmap.entrySet()) { 
        System.out.println(m.getKey()+" "+m.getValue()); 
    }
	
	    for (Map.Entry <String, String > m:hasmap.entrySet()) { 
        System.out.println(m.getKey()+" "+m.getValue()); 
    }
    
}   

}

