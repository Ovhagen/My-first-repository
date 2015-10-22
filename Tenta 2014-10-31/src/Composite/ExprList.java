package Composite;
import java.util.ArrayList;

public class ExprList extends ArrayList<Expr> implements Expr{
	
	public ExprList(){
	}

	public String print() {
		StringBuilder sb = new StringBuilder();
		for(Expr e: this){
			sb.append(e.print() + " ");
		}
		return sb.toString();
	}


}
