package edu.umb.cs680.hw03;

public class Singleton {
	private static Singleton instance;
	public String cde;
	private Singleton(String val)
	{
		this.cde=val;
	}
	public static Singleton getInstance(String val)
	{
		if(instance == null)
		{
			instance = new Singleton(val);
		}
		return instance;
	}

}