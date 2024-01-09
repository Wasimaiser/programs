package com.scr.Test;

import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<String>();
		l.add("Wasim");
		l.add("Fahim");
		l.add("Imtiyaz");
		l.add("Farzana");
		System.out.println(l.isEmpty());
		if(l.isEmpty())
		{
			System.out.println("list is Empty");
		}
		else
		{
			System.out.println("list isnt Empty");
		}
		l.clear();
		System.out.println(l.isEmpty());
		if(l.isEmpty())
		{
			System.out.println("list is Empty");
		}
		else
		{
			System.out.println("list isnt Empty");
		}
	}

}
