package uppg4_tenta_2009;

public class WithExtension implements Extension{
	private Unit unit;
	
	public WithExtension(Unit unit){
		this.unit = unit;
	}
	
	public String toString(){
		return " extends " + unit.name;
	}
}
