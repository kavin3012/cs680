package edu.umb.cs680.hw13.comparators;

import java.util.Comparator;

import edu.umb.cs680.hw13.FSElement;

public class ReverseAlphabeticalComparator implements Comparator<FSElement> 
{

	public int compare(FSElement obj1, FSElement obj2) {
		return obj2.getName().compareTo(obj1.getName());
	}


}