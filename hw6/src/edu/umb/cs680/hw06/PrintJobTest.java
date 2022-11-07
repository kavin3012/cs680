package edu.umb.cs680.hw06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrintJobTest {

	@Test
    public void colourTest() {
	String password = "password";
	SecurityContext ctx = SecurityContext.getInstance();
	PrintJob ModelXYZ= new ModelXYZ();
	ctx.logIn(password);
	ModelXYZ.execute(password,ctx);
	}
	
	@Test
    public void printTest() {
	String password = "password";
	SecurityContext ctx = SecurityContext.getInstance();
	PrintJob ModelABC= new ModelABC();
	ctx.logIn(password);
	ModelABC.execute(password,ctx);
	}
}