
public abstract class Currency implements Comparable<Currency> {
	protected double value;
	protected double amount;

	protected Currency(double value, double amount) {
		this.value = value;
		this.amount = amount;
	}

	@Override
	public int compareTo(Currency c) {
		return (int) (this.amount - c.amount);
	}

	protected double value() {
		return value;
	}

	public void exchange(Currency c){
		
	}

	public boolean isSame(Currency c){
		return this.toString().equals(c.toString());
	}

	public double add(Currency c) throws CurrencyException {
		if (!c.isSame(this))
			throw new CurrencyException("U done fucked up");

		return this.amount + c.amount;
	}

	public double sub(Currency c) throws CurrencyException{
		if (!c.isSame(this))
			throw new CurrencyException("U done fucked up");

		return this.amount - c.amount;
	}
	
}
