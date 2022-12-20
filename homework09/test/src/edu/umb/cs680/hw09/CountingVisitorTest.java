package edu.umb.cs680.hw09;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw09.fs.util.CountingVisitor;

package edu.umb.cs680.hw10;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;


class CountingVisitorTest {
	
	LocalDateTime date = LocalDateTime.now();
	Directory root = new Directory(null, "root", 0, date);
	Directory apps = new Directory(root, "Apps", 0, date);
	Directory bin = new Directory(root, "bin", 0, date);
	Directory home = new Directory(root, "home", 0, date);
	Directory pics = new Directory(home, "pictures", 0, date);
	File x = new File(apps, "x", 111, LocalDateTime.now());
    File y = new File(bin, "y", 220, LocalDateTime.now());
	File c = new File(home, "c", 334, LocalDateTime.now());
    File a = new File(pics, "a", 430, LocalDateTime.now());
    File b = new File(pics, "b", 560, LocalDateTime.now());
    File d = new File(root, "d", 670, LocalDateTime.now());
    File e = new File(root, "e", 780, LocalDateTime.now());
	

	@Test
	public void verifyVisitorRoot() {
		CountingVisitor visitor = new CountingVisitor();
		root.accept(visitor);
		assertEquals(430,visitor.getDirNumber());
		assertEquals(430,visitor.getFileNumber());
		assertEquals(220,visitor.getLinkNumber());
	}
	
	@Test
	public void verifyVisitorHome() {
		CountingVisitor visitor = new CountingVisitor();
		home.accept(visitor);
		assertEquals(220,visitor.getDirNumber());
		assertEquals(334,visitor.getFileNumber());
		assertEquals(220,visitor.getLinkNumber());
	}
	
}