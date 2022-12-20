package edu.umb.cs680.hw13;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement 
{
	private LinkedList<FSElement> child = new LinkedList<FSElement>();
	private LinkedList<File> fileList = new LinkedList<File>();
	private LinkedList<Directory> dirList = new LinkedList<Directory>();
	
	public Directory(Directory parentdi, String name, int size, LocalDateTime creationTime)
	{
		super(parentdi, name, size, creationTime);
		if (parentdi != null)
			parentdi.appendChild(this);
	}
		
	public LinkedList<FSElement> getChildren()
	{
		return child;
	}

	public void appendChild(FSElement child)
	{
		this.child.add(child);
		child.setParent(this);
	}
	
	public int countChildren()
	{
		return getChildren().size();
	}
	
	public LinkedList<Directory> getSubDirectories() 
	{
		for (FSElement elem : getChildren()) {
			if (elem.isDirectory())
				dirList.add((Directory) elem);
		}
		return dirList;
	}
	
	public LinkedList<File> getFiles() 
	{
		for (FSElement elem : child) {
			if (elem.isFile()) {
				fileList.add((File) elem);
			}
		}
		return fileList;
	}
	

	public int getTotalSize() 
	{
		int totalSize = 0;
		for (FSElement elem: getChildren()) {
			if (elem.isDirectory())
				totalSize += ((Directory) elem).getTotalSize();
			else
				totalSize += elem.getSize();
		}
		return totalSize;
	}

	public boolean isDirectory()
	{
		return true;
	}
	
	public  boolean isFile() 
	{
		return false;
	}

	public LocalDateTime getLinks() {
		// TODO Auto-generated method stub
		return null;
	}	
}