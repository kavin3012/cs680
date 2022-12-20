package edu.umb.cs680.hw09;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;


class FileSystemTest {
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
	
	private String[] toStringArray(Directory di) {
		String[] dInfo = { null, di.getName(), Integer.toString(di.getSize()), di.getCreationTime().toString() };
		return dInfo;
	}
	
	@Test
	void testDirectoryverification() {
		String[] expected = { null, "root", "0", date.toString() };
		Directory actual = root;
		assertArrayEquals(expected, toStringArray(actual));
	}
	
	@Test
	void testSimilarFileverification() {
		FileSystem fOne = FileSystem.getFileSystem();
		FileSystem fTwo = FileSystem.getFileSystem();
		assertSame(fOne, fTwo);
	}

}