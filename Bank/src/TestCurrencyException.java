
public class TestCurrencyException {

	public static void main(String[] args) {
		try {
			throw new CurrencyException("U done fucked up");
		} catch (CurrencyException e) {
			System.err.println(e.getMessage());
		}
	}

}
