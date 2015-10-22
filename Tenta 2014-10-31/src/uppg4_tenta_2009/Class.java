package uppg4_tenta_2009;

import java.util.List;

public class Class extends Unit {
	private List<Interface> interfaces;
	
	public Class(String name, Extension extension, List<Interface> interfaces) {
		super(name, extension);
		this.interfaces = interfaces;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("class ");
		sb.append(super.toString());
		if(interfaces.size() > 0){
			sb.append(" implements ");
			for(Interface i: interfaces){
				sb.append(i.name);
				sb.append(", ");
			}
			int length = sb.length();
			sb.delete(length - 2, length);
		}	
		return sb.toString();
	}

}
