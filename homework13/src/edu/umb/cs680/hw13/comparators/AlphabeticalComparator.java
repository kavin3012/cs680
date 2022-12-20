package edu.umb.cs680.hw13.comparators;

import java.util.Comparator;

import edu.umb.cs680.hw13.FSElement;


public class AlphabeticalComparator implements Comparator<FSElement> {
	
	public int compare(FSElement obj1, FSElement obj2) {
		return obj1.getName().compareTo(obj2.getName());
	}
}