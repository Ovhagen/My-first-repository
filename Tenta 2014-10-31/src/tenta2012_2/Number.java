package tenta2012_2;

public class Number implements Expr {
	private int value;

	public Number(int value) {
		this.value = value;
	}

	@Override
	public int value() {
		return value;
	}

}
