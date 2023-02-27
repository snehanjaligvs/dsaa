
class Node{
	int item;
	Node left, right;
	public Node(int i) {
		item = i;
		left = right = null;
	}
}
public class Binarytree {
	
		Node root;
		public  Binarytree(int i) {
			root  = new Node(i);
		}
		public Binarytree() {
			root  = null;
		}
		
	public static void Inorder(Node node) {
		if(node != null) {
			
			Inorder(node.left);
			System.out.println(node.item);
			Inorder(node.right);
			
		}
	}
	public static void Postorder(Node node) {
		if(node != null) {
			
			Postorder(node.left);
			Postorder(node.right);
			System.out.println(node.item);
			
		}
	}
	public static void Preorder(Node node) {
		if(node != null) {
			System.out.println(node.item);
			Preorder(node.left);
			Preorder(node.right);
			
		}
	}

	public static void main(String[] args) {
		
		Binarytree b = new Binarytree();
		b.root = new Node(1);
		b.root.left = new Node(2);
		b.root.right = new Node(3);
		b.root.left.left = new Node(4);
		b.root.left.right = new Node(5);
		b.root.right.left = new Node(6);
		b.root.right.right = new Node(7);
		System.out.println("Preorder traversal of the tree");
		Preorder(b.root);
		System.out.println("Postorder traversal of the tree");
		Postorder(b.root);
		System.out.println("Inorder traversal of the tree");
		Inorder(b.root);

	}

}
