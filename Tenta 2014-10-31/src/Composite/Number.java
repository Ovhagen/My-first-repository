package Composite;

public class Number implements Expr {
	private int value;

	public Number(int value) {
		this.value = value;
	}

	@Override
	public String print() {
		return String.valueOf(value);
	}

}
