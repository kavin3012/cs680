package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import java.time.LocalDateTime;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;


class CrawlingVisitorTest {
	LocalDateTime date = LocalDateTime.now();
	Directory root = new Directory(null, "root", 0, date);
	Directory apps = new Directory(root, "Apps", 0, date);
	Directory bin = new Directory(root, "bin", 0, date);
	Directory home = new Directory(root, "home", 0, date);
	Directory pics = new Directory(home, "pictures", 0, date);
	File x = new File(apps, "x", 111, date);
    File y = new File(bin, "y", 220, date);
	File c = new File(home, "c", 334, date);
    File a = new File(pics, "a", 430, date);
    File b = new File(pics, "b", 560, date);
    File d = new File(root, "d", 670, date);
    File e = new File(root, "e", 780, date);
	

	  
	@Test
	public void fileCrawlingVisitHome() {
		CrawlingVisitor visitor = new CrawlingVisitor();
		home.accept(visitor);
		LinkedList<File> actual = visitor.getFiles();
		File[] expected = {c,d,b};
		assertArrayEquals(expected, actual.toArray());
	}
	
	@Test
	public void fileCrawlingVisitRoot() {
		CrawlingVisitor visitor = new CrawlingVisitor();
		root.accept(visitor);
		LinkedList<File> actual = visitor.getFiles();
		File[] expected = {a,c,d,b};
		assertArrayEquals(expected, actual.toArray());
	}
		
	
	

		
		
}
