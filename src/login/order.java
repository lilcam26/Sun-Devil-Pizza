package login;

public class order {
	
	String type;
	int id;
	boolean to;
	boolean te;
	boolean tol;
	boolean tm;

	public order(String type, int id,boolean to,boolean te, boolean tol, boolean tm) {
		
		this.type = type;
		this.id = id;
		this.to = to;
		this.tol = tol;
		this.tm = tm;
		this.te = te;
		
	}

}
