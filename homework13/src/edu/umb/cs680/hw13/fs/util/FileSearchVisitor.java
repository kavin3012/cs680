package edu.umb.cs680.hw13.fs.util;

import edu.umb.cs680.hw13.Directory;
import edu.umb.cs680.hw13.File;
import edu.umb.cs680.hw13.Link;

public class FileSearchVisitor implements FSVisitor
{
	private String fileName;
	private File file;

	public void visit(File file)
	{
		if (fileName.equals(file.getName()))
			this.file = file;
	}
	
	public File getFile() 
	{
		return file;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public void visit(Directory dir) 
	{
		return;
	}

	public void visit(Link link) 
	{
		return;
	}	
}