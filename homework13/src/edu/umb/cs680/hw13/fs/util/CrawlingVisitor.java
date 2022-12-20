package edu.umb.cs680.hw13.fs.util;

import edu.umb.cs680.hw13.Directory;
import edu.umb.cs680.hw13.File;
import edu.umb.cs680.hw13.Link;

import java.util.LinkedList;


public abstract class CrawlingVisitor implements FSVisitor {
	
	private LinkedList<File> files = new LinkedList<File>();
	
	public LinkedList<File> getFiles() {
		return files;
			
	}
	public void visit(Link link) {
		return;
	}
	
	public void visit(File file) {
		files.add(file);
	}
	
	public void visit(Directory dir) {
		return;
	}
	
}