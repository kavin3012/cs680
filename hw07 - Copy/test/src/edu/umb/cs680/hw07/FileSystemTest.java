package edu.umb.cs680.hw07;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.time.LocalDateTime;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class FileSystemTest {
	
	Directory root = new Directory(null, "root", LocalDateTime.now());
	Directory apps = new Directory(root, "Apps", LocalDateTime.now());
	Directory lib = new Directory(root, "lib", LocalDateTime.now());
	Directory home = new Directory(root, "home", LocalDateTime.now());
	Directory code = new Directory(home, "code", LocalDateTime.now());
	File x = new File(apps, "x", 1, LocalDateTime.now());
    File y = new File(apps, "y", 2, LocalDateTime.now());
	File z = new File(lib, "z", 3, LocalDateTime.now());
	File d = new File(home, "d", 4, LocalDateTime.now());
    File a = new File(code, "a", 5, LocalDateTime.now());
    File b = new File(code, "b", 6, LocalDateTime.now());
    File c = new File(code, "c", 7, LocalDateTime.now());
	
	@Test
	public void verifyRootDirectoriesEqualityFS(){
		LinkedList<Directory> expected = new LinkedList<>();
		expected.add(home);
		expected.add(apps);
		FileSystem fs = FileSystem.getFileSystem();
		fs.appendRootDirectory(home);
		fs.appendRootDirectory(apps);
		assertEquals(expected, fs.getRootDirs());
	}
}
