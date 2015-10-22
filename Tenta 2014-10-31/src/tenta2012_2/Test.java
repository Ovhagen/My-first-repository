package tenta2012_2;

public class Test {

	public static void main(String[] args) {
		Expr expr = new BinExpr(new BinExpr(new Number(1), new Number(2), new Add()),
				new Number(3), new Mul());
		System.out.println(expr.value());
		BinExpr expr1 = new BinExpr(new Number(10), new Number(50), new Add());
		System.out.println(expr1.value());
		expr1.setOperation(new Mul());
		System.out.println(expr1.value());
	}
}
