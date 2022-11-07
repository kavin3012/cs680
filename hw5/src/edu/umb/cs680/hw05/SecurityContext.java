package edu.umb.cs680.hw05;

public class SecurityContext {
	private static SecurityContext instance = null;
	private static State state;
	private SecurityContext(State k) {
		state = k;
	}
	
	public static SecurityContext getInstance() {
		if (instance == null){
			State k = LoggedOut.getInstance();
			instance = new SecurityContext(k);
		}
		return instance;
	}
	
	public void changeState(State st){
		state =st;
	}
	
	
	
	public void logIn(String pswd) {
		state.logIn(pswd);
	}
	
	public void logOut() {
		state.logOut();
	}
	public Object getState() {
		 return state;
	}
}