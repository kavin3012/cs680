package edu.umb.cs680.hw09;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw09.fs.util.FileSearchVisitor;

public class FileSearchVisitorTest {
	
	LocalDateTime date = LocalDateTime.now();
	Directory root = new Directory(null, "root", 0, LocalDateTime.now());
	Directory apps = new Directory(root, "Apps", 0, LocalDateTime.now());
	Directory bin = new Directory(root, "bin", 0, LocalDateTime.now());
	Directory home = new Directory(root, "home", 0, LocalDateTime.now());
	Directory pics = new Directory(home, "pictures", 0, LocalDateTime.now());
	File x = new File(apps, "x", 1, LocalDateTime.now());
    File y = new File(bin, "y", 2, LocalDateTime.now());
	File c = new File(home, "c", 3, LocalDateTime.now());
    File a = new File(pics, "a", 4, LocalDateTime.now());
    File b = new File(pics, "b", 5, LocalDateTime.now());
    File d = new File(root, "d", 6, LocalDateTime.now());
    File e = new File(root, "e", 7, LocalDateTime.now());
    
    @Test
	public void verifyDirectoryEqualityRoot() {
		FileSearchVisitor vis = new FileSearchVisitor("x");
		root.accept(vis);
		assertSame(x, vis.getFoundFiles().get(0));
	}
    
    
}