package uppg4;

public class Interest implements Algorithm {
	private float interest;

	public Interest(float interest) {
		this.interest = interest;
	}

	@Override
	public float amount(float balance, int days) {
		return balance * days * interest / 365;
	}

}
