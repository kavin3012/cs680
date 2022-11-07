package edu.umb.cs680.hw05;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecurityContextTest {
	String pswd;
	
	@Test
    public void Washington() {
	SecurityContext ctx = SecurityContext.getInstance();
	State expected;
	ctx.logIn(pswd);
	expected = LoggedIn.getInstance();
	assertSame(expected, ctx.getState());
	}
	
	@Test
    public void Newyork() {
	SecurityContext ctx = SecurityContext.getInstance();
	ctx.logIn(pswd);
	ctx.logOut();
	assertTrue(ctx.getState() instanceof LoggedOut);
	
	}

}
