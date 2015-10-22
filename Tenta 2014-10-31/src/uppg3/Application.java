package uppg3;

public class Application {
	private Shape shape;
	private Shape StandardShape;

	public Application(Shape shape) {
		this.shape = shape;
		this.StandardShape = shape;
		traceOff();
	}

	public void traceOn() {
		shape = new TracedShape(shape);
	}

	public void traceOff() {
		shape = StandardShape;
	}

	public void execute() {
		shape.draw();
	}

}
