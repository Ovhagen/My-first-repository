package uppg3;

public class Test {

	public static void main(String[] args) {
		Application app = new Application(new Rectangle());
		app.execute();
		app.traceOn();
		app.execute();
		app.traceOff();
		app = new Application(new Circle());
		app.execute();
		app.traceOn();
		app.execute();
		app.execute();
	}

}
