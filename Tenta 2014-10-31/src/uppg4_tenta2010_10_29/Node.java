package uppg4_tenta2010_10_29;

public class Node implements BinaryTree {

	protected Object data;
	protected BinaryTree left, right;

	protected Node(Object data, BinaryTree left, BinaryTree right) {
		this.left = left;
		this.right = right;
		this.data = data;
	}

	@Override
	public void printNodes() {
		left.printNodes();
		System.out.println(data);
		right.printNodes();
	}

}
