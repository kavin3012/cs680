package edu.umb.cs680.hw06;

public class LoggedOut implements State {
	private static LoggedOut instance = null;
	
	public static LoggedOut getInstance() {
		if(instance == null) {
			instance = new LoggedOut();
		}
		return instance;
	}
	
	public boolean authenticate(String pswd) {
		return true;
	}
	
	public void logIn(String pswd) {
		if(authenticate(pswd)) {
		ctx.changeState(LoggedIn.getInstance());
		}
	}
	
	public void logOut() {
		
	}

}