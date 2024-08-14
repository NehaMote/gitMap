package com.map;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//map is unordered??
//map is unordered so we can not iterate it directly ,we can iterate it by using  keySet() and entrySet()
public class Name {
	public static void main(String[] args) {
//		Map<Integer, String> m1=new HashMap();
//		m1.put(102,"Neha");
//		m1.put(101,"Riya");
//		m1.put(103,"sid");
		
		Map<String, Integer> m1=new HashMap();
		m1.put("Neha",102);
		m1.put("Riya",101);
		m1.put("sid",103);
		
		System.out.println(m1);
		System.out.println("*********************");
		
	    Set s1=m1.keySet();
	    Iterator itr=s1.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
		System.out.println("********************");
		
		Set s2=m1.entrySet();		
		Iterator itr2=s2.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		}
	}


