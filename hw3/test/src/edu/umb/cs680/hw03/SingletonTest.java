package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {
	@Test
	public void getInstance()
	{
		Singleton singleton = Singleton.getInstance("Newyork");
		assertNotNull(singleton);
	}
	
	@Test
	public void Equalinstance() {
		Singleton expected = Singleton.getInstance("Newyork");
		Singleton actual = Singleton.getInstance("Edison");
		assertEquals(expected.hashCode(),actual.hashCode());
	}

}