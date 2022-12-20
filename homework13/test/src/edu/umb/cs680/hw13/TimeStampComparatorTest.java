package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw13.comparators.TimeStampComparator;

package edu.umb.cs680.hw12;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class TimeStampComparatorTest {
	

	LocalDateTime date = LocalDateTime.now();
	Directory root = new Directory(null, "root", 0, date);
	Directory apps = new Directory(root, "apps", 0, date);
	Directory lib = new Directory(root, "lib", 0, date);
	Directory home = new Directory(root, "home", 0, date);
	Directory code = new Directory(home, "code", 0, date);
	File x = new File(apps, "a", 2000, date);
	File y = new File(apps, "a", 1900, date);
	File z = new File(lib, "a", 1800, date);
	File a = new File(code, "a", 2100, date);
	File b = new File(code, "b", 500, date);
	File c = new File(code, "c", 700, date);
	File d = new File(home, "d", 900, date);
	  
	@Test
	public void GetChildrenRootTest() {
		Directory dir = root;
		LinkedList<FSElement> actual = dir.getChildren(new TimeStampComparator());
		FSElement[] expected = { apps,home };
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void getSubDirectoriesHomeTest() {
	    Directory dir = home;
		LinkedList<Directory> actual = dir.getSubDirectories(new TimeStampComparator());
		Directory[] expected = { code };
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void getFilesHomeTest() {
		Directory dir = home;
		LinkedList<File> actual = dir.getFiles(new TimeStampComparator());
		File[] expected = { b };
		assertArrayEquals(expected, actual.toArray());
	}
	
	
}