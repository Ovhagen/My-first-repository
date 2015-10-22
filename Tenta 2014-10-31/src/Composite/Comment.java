package Composite;

public class Comment implements Expr{
	private String comment;
	
	public Comment(String comment){
		this.comment = comment;
	}

	@Override
	public String print() {
		return comment;
	}

}
