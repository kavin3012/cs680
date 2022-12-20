package edu.umb.cs680.hw07;

import java.time.LocalDateTime;

public class File extends FSElement {
	
	public File(Directory maindir, String name, int size, LocalDateTime creationTime)
	{
		super(maindir, name, size, creationTime);
		maindir.appendChild(this);
	}
	public boolean isFile() 
	{
		return true;
	}
	public boolean isDirectory() 
	{
		return false;
	}
	
}
