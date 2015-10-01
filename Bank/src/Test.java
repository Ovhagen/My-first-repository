
public class Test {

	public static void main(String[] args) {
		Sek s = new Sek(1, 15);
		Sek p = new Sek(1, 10);
		USD d = new USD(8.5, 15);
		try {
			s.add(d);
		} catch (CurrencyException e) {
			System.err.println(e.getMessage());
		}
	}
}
