package uppg3;

public class TracedShape implements Shape{
	private Shape origShape;
	
	public TracedShape(Shape origShape){
		this.origShape = origShape;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		System.out.println("Dekorerar nu en " + origShape.toString());
		origShape.draw();
	}

}
