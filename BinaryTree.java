import Node;

class BinaryTree
{
	//Root of Binary Tree 
	Node root;
	BinaryTree(int value) 
	{ 
		root = new Node(value); 
	} 
	// Recursive function to perform pre-order traversal of the tree
    public static void PreOrder(Node node) {
		// return if the current node is empty
		if (node == null) {
			return;
		}
		// Display the value part of the current node
		System.out.print(node.value + " ");
		// Traverse the left subtree
		PreOrder(node.leftChild);
		// Traverse the right subtree
		PreOrder(node.rightChild);
	}
	// Recursive function to perform post-order traversal of the tree
	public static void PostOrder(Node node) {
		// return if the current node is empty
		if (node == null) {
			return;
		}
		// Traverse the left subtree
		PostOrder(node.leftChild);
		// Traverse the right subtree
		PostOrder(node.rightChild);
		// Display the value part of the current node
		System.out.print(node.value +" ");
	}

	public static void InOrder(Node node) {
		if (node == null) {
			return;
		}
		// Traverse the left subtree
		InOrder(node.leftChild);
		// Display the value part of the current node
		System.out.print(node.value +" ");
		// Traverse the right subtree
		InOrder(node.rightChild);

	}
	//Print Tree in pre-,in- and post-order traversals
	public static void PrintTree(BinaryTree tree){
		System.out.println("\n"+"Pre-Order Traversal : ");
		PreOrder(tree.root);
		System.out.println("\n"+"Post-Order Traversal : ");
		PostOrder(tree.root);
		System.out.println("\n"+"In-Order Traversal : ");
		InOrder(tree.root);
	}

	public static void main(String[] args) {
		//Create new instance of a Binary Tree
		BinaryTree tree = new BinaryTree(10);
		tree.root.leftChild = new Node(20);
		tree.root.rightChild = new Node(30);
		tree.root.leftChild.leftChild = new Node(40);
		tree.root.leftChild.rightChild = new Node(50);
		tree.root.rightChild.leftChild = new Node(60);
		tree.root.rightChild.rightChild = new Node(70);
		tree.root.leftChild.leftChild.leftChild = new Node(80);
		tree.root.leftChild.leftChild.rightChild = new Node(90);
		tree.root.leftChild.rightChild.leftChild = new Node(100);
		//Call PrintTree
		PrintTree(tree);
}
}
