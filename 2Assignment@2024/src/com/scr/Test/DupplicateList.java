package com.scr.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DupplicateList 
{
	public static void main(String args[])
	{
		List<String> l = new ArrayList<String>();
		l.add("Wasim");
		l.add("Fahim");
		l.add("Imtiyaz");
		l.add("Farzana");
		List  duplList = new ArrayList<>();
		Collections.addAll(duplList, l);
		System.out.println(duplList);
		
	}
}
