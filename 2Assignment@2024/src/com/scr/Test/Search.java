package com.scr.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Search 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> m = new TreeMap<>();
		m.put(1, "Wasim");
		m.put(02, "fahim");
		System.out.println(m);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter for searcing by key");
		int search = sc.nextInt();

		if (m.containsKey(search))
		{

			System.out.println(m.get(search));
		} else 
		{
			System.out.println("Value Not present");
		}
		Map<String, String> m2 = new HashMap<>();
		m2.put("Note10", "Samsung");
		m2.put("iphone 15", "Apple");
		System.out.println(m2);

	}
}
