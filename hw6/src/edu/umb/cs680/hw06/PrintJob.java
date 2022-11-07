package edu.umb.cs680.hw06;

abstract class PrintJob{
	public final void execute(String pswd,SecurityContext ctx){
		doAuthentication(pswd);
		doAccessControl();
		doPrint(ctx);
		doErrorHandling();
	}
	public abstract void doAuthentication(String pswd);
	public abstract void doAccessControl();
	public abstract void doPrint(SecurityContext ctx);
	public abstract void doErrorHandling();
}


class ModelXYZ extends PrintJob{
	@Override
	public void doAuthentication(String password){
		
	}

	@Override
	public void doAccessControl() {
	}

	@Override
	public void doPrint(SecurityContext ctx) {
		if(ctx.getState()==LoggedOut.getInstance()) {
		}
	}

	@Override
	public void doErrorHandling() {
	}
}
	
class ModelABC extends PrintJob {
	@Override
	public void doAuthentication(String pswd){
	}

	@Override
	public void doAccessControl() {
	}

	@Override
	public void doPrint(SecurityContext ctx) {
		if(ctx.getState()==LoggedOut.getInstance()) {
			System.out.println("jobs halted");
		}
	}

	@Override
	public void doErrorHandling() {
	}
}