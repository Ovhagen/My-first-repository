package MVC;

public class Test {

	public static void main(String[] args) {
		Circular c = new Circular();

		try {
			c.value();
		} catch (SuperException s) {
			System.err.println(s.getMessage());
		}
	}

}
