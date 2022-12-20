package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

public abstract class FSElement 
{
	private String name;
	private int size;
	private LocalDateTime creationTime;
	private Directory parentdi;

	public FSElement(Directory parentdi, String name, int size, LocalDateTime creationTime) 
	{
		this.parentdi = parentdi;
		this.name = name;
		this.size = size;
		this.creationTime = creationTime;
	}
	
	public Directory getParent()
	{
		return parentdi;
	}
	
	public String getName() {
		return name;
		
	}

	public LocalDateTime getCreationTime() 
	{
		return creationTime;
	}
	
	public int getSize() 
	{
		return size;
	}

	public void setParent(Directory parentdi) 
	{
		this.parentdi = parentdi;
	}
	protected abstract boolean isDirectory();
    protected abstract boolean isFile();	
}