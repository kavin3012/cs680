package edu.umb.cs680.hw05;

public class LoggedIn implements State {
	private static LoggedIn instance = null;
	
	public static LoggedIn getInstance() {
		if(instance == null) {
			instance = new LoggedIn();
		}
		return instance;
	}
	
	public boolean isActive() {
		return true;
	}
	
	public void logOut() {
		ctx.changeState(LoggedOut.getInstance());
	}
	
	public void logIn(String pswd) {
		if(isActive()) {
		
		}
		else {
			ctx.changeState(LoggedOut.getInstance());
			
		}
		
	}
	

}