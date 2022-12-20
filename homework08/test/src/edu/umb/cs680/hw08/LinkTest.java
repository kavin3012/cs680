package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;


class LinkTest {

	LocalDateTime date = LocalDateTime.now();
	Directory root = new Directory(null, "root", 0, date);
	Directory apps = new Directory(root, "apps", 0, date);
	Directory home = new Directory(root, "home", 0, date);
    Directory code = new Directory(home, "code", 0, date);
	File a = new File(apps, "a", 5, date);
	File b = new File(home, "b", 10, date);
	File c = new File(code, "c", 20, date);
	File d = new File(code, "d", 30, date);
    Link x = new Link(home, "x", 0, date, apps);
	Link y = new Link(code, "y", 0, date, a);

	
	@Test
	public void linkVerification() {
		assertTrue(x.isLink());
		assertTrue(y.isLink());
    }
	
}