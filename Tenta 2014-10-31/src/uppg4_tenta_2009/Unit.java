package uppg4_tenta_2009;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit{
	protected String name;
	protected Extension extension;
	
	public Unit(String name, Extension extension){
		this.name = name;
		this.extension = extension;
	}

	public String toString() {
		return name + extension;
	}
	
	public static void main(String[] args) {
		List<Interface> list = new ArrayList<Interface>();
		list.add(new Interface("C", new NoExtension()));
		list.add(new Interface("D", new NoExtension()));
		Unit unit = new Class("A", new WithExtension(new Class("B", new NoExtension(), list)), list);
		System.out.println(unit);
		Interface i = new Interface("G", new WithExtension(new Class("hello", new NoExtension(), list)));
		System.out.println(i);
		}

}
