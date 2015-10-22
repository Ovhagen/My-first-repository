package uppg4;

public class Account {
	private float balance;
	private Algorithm algorithm;
	
	public void setAlgorithm(Algorithm algorithm){
		this.algorithm = algorithm;
	}

	public float revenue(int days) {
		return algorithm.amount(balance, days);
	}
	// other methods omitted
}
