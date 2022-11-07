package edu.umb.cs680.hw06;

public interface State {
	SecurityContext ctx = SecurityContext.getInstance();
	void logIn(String pswd);
	void logOut();
}