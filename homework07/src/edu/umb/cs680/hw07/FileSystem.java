package edu.umb.cs680.hw07;

import java.util.LinkedList;

public class FileSystem
{
	
	private static FileSystem inst = null;
	private LinkedList<Directory> therootDirectory = new LinkedList<Directory>();

	public static FileSystem getFileSystem()
	{
		if (inst == null)
			inst = new FileSystem();
		return inst;
	}
	
	public void addRootDirec(Directory dir) 
	{
		therootDirectory.add(dir);
	}

	public LinkedList<Directory> getRootDirec()
	{
		return this.therootDirectory;
	}

	
}