package Composite;

public class TestComposite {
	
	public static void main(String[] args) {
		ExprList list = new ExprList();
		list.add(new Comment("Jag �r"));
		list.add(new Number(20));
		list.add(new Comment("�r. Och favoritnumret �r"));
		list.add(new Number(9));
		System.out.println(list.print());
	}

}
