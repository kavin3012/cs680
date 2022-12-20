package edu.umb.cs680.hw13;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DirectoryTest 
{
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

	
	private String[] dirToStringArray(Directory d) {
		Optional<Directory> optionalDirectory = Optional.ofNullable(d.getParent());
		String[] directorystring = { Boolean.toString(d.isDirectory()), d.getName(), 
				Integer.toString(d.getSize()), d.getCreationTime().toString(), 
				optionalDirectory.isPresent()?d.getParent().getName():null, 
						Integer.toString(d.getTotalSize()),
						Integer.toString(d.countChildren())};
		return directorystring;
	}

	
	
	@Test
	void testdirectoryandfiles()
	{
		FileSystem fileSystem = FileSystem.getFileSystem();
		assertTrue(root.isDirectory());
		assertTrue(apps.isDirectory());
		assertTrue(lib.isDirectory());
		assertTrue(home.isDirectory());
		assertTrue(a.isFile());
		assertTrue(b.isFile());
		assertTrue(c.isFile());
		assertTrue(x.isFile());
		assertTrue(y.isFile());
		
	}
	
	
	@Test
	void verifydirecorynumbers()
	{
		FileSystem fileSystem = FileSystem.getFileSystem();
		assertSame("a", apps.getFiles().get(0).getName());
		assertSame("a", apps.getFiles().get(1).getName());
		assertSame("d", home.getFiles().get(0).getName());
		assertSame("a", code.getFiles().get(0).getName());
	}
	
	@Test
	void verifysubdirectoriesonly() 
	{
		FileSystem fileSystem = FileSystem.getFileSystem();
		assertSame("apps", root.getSubDirectories().get(0).getName());
		assertSame("lib", root.getSubDirectories().get(1).getName());
		assertSame("code",home.getSubDirectories().get(0).getName());
	}
	@Test
	void verifycodesize() 
	{
		FileSystem fileSystem = FileSystem.getFileSystem();
		System.out.println(code.getTotalSize());
		assertEquals(3300, code.getTotalSize());

		
	}
	
	@Test
	void verifyfoldersize()
	{
		FileSystem fileSystem = FileSystem.getFileSystem();
		System.out.println(home.getTotalSize());
		assertEquals(9900, root.getTotalSize());
		assertEquals(3900, apps.getTotalSize());
		assertEquals(3300, code.getTotalSize());
		assertEquals(4200, home.getTotalSize());
		
	}
	
	@Test
	void verifysubfilesandfoldersnumber()
	{
		FileSystem fileSystem = FileSystem.getFileSystem();
		System.out.println(code.countChildren());
		assertEquals(3, root.countChildren());
		assertEquals(2, apps.countChildren());
		assertEquals(3, code.countChildren());
		assertEquals(2, home.countChildren());
		
	}
	@Test
	void verifysize() 
	{
		FileSystem fileSystem = FileSystem.getFileSystem();
		assertEquals(9900, root.getTotalSize());	
	}
	



}

	