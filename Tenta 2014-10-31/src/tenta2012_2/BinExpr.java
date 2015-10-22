package tenta2012_2;

public class BinExpr implements Expr{
	private Expr expr1, expr2;
	private Operation operation;
	
	public BinExpr(Expr expr1, Expr expr2, Operation operation){
		this.expr1 = expr1;
		this.expr2 = expr2;
		this.operation = operation;
	}
	
	public void setOperation(Operation operation){
		this.operation = operation;
	}

	public int value() {
		return operation.value(expr1.value(), expr2.value());
	}
}
